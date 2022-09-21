package typings.obsStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object obsstudio {
    
    @JSGlobal("obsstudio")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the current control permission level, as set by the user in the obs-browser plugin settings.
      *
      * Control permission levels are returned as numbers, and represent the following:
      *
      * 0 = NONE
      * 1 = READ_OBS
      * 2 = READ_USER
      * 3 = BASIC
      * 4 = ADVANCED
      * 5 = ALL
      *
      * @param callback The callback provided by the caller to receive the control level.
      */
    // tslint:disable-next-line:no-any
    inline def getControlLevel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlLevel")().asInstanceOf[Unit]
    inline def getControlLevel(callback: js.Function1[/* level */ OBSControlLevel, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlLevel")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Gets the currently selected scene in OBS Studio.
      *
      * Requires permission level of READ_USER or higher.
      *
      * @param callback The callback provided by the caller to receive the current scene, if successful.
      */
    // tslint:disable-next-line:no-any
    inline def getCurrentScene(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentScene")().asInstanceOf[Unit]
    inline def getCurrentScene(callback: js.Function1[/* scene */ OBSSceneInfo, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentScene")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Gets the name of the currently selected transition in OBS Studio.
      *
      * Requires permission level of READ_USER or higher.
      *
      * @since 2.17
      * @param callback The callback provided by the caller to receive the name of the current transition, if successful.
      */
    // tslint:disable-next-line:no-any
    inline def getCurrentTransition(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentTransition")().asInstanceOf[Unit]
    inline def getCurrentTransition(callback: js.Function1[/* transition */ String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentTransition")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Gets the name of scenes in the current scene collection.
      *
      * Requires permission level of READ_USER or higher.
      *
      * @since 2.17
      * @param callback The callback provided by the caller to receive the array of scene names, if successful.
      */
    // tslint:disable-next-line:no-any
    inline def getScenes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getScenes")().asInstanceOf[Unit]
    inline def getScenes(callback: js.Function1[/* scenes */ js.Array[String], Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getScenes")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Gets the output status of OBS Studio.
      *
      * Requires permission level of READ_OBS or higher.
      *
      * @param callback The callback provided by the caller to receive the output status, if successful.
      */
    // tslint:disable-next-line:no-any
    inline def getStatus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")().asInstanceOf[Unit]
    inline def getStatus(callback: js.Function1[/* status */ OBSStatus, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Gets the name of transitions in the current scene collection.
      *
      * Requires permission level of READ_USER or higher.
      *
      * @since 2.17
      * @param callback The callback provided by the caller to receive the array of transition names, if successful.
      */
    // tslint:disable-next-line:no-any
    inline def getTransitions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitions")().asInstanceOf[Unit]
    inline def getTransitions(callback: js.Function1[/* transitions */ js.Array[String], Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitions")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * This function is called when the active/inactive state of the browser source changes in OBS.
      *
      * @deprecated since version 2.8.5
      */
    inline def onActiveChange(visibility: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onActiveChange")(visibility.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * This function is called when the visibility of the browser source changes in OBS.
      *
      * @deprecated since version 2.8.5
      */
    inline def onVisibilityChange(visibility: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onVisibilityChange")(visibility.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Pauses recording in OBS Studio.
      *
      * Requires permission level of ALL.
      */
    inline def pauseRecording(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseRecording")().asInstanceOf[Unit]
    
    /**
      * OBS Browser plugin version.
      */
    @JSGlobal("obsstudio.pluginVersion")
    @js.native
    val pluginVersion: String = js.native
    
    /**
      * Save the Replay Buffer in OBS Studio.
      *
      * Requires permission level of BASIC or higher.
      */
    inline def saveReplayBuffer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveReplayBuffer")().asInstanceOf[Unit]
    
    /**
      * Sets the current scene to the specified scene.
      *
      * Requires permission level of ADVANCED or higher.
      *
      * @since 2.17
      * @param scene The name of the scene to switch to.
      */
    inline def setCurrentScene(scene: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentScene")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Sets the current transition to the specified transition.
      *
      * Requires permission level of ADVANCED or higher.
      *
      * @since 2.17
      * @param transition The name of the transition to switch to.
      */
    inline def setCurrentTransition(transition: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentTransition")(transition.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Starts recording in OBS Studio.
      *
      * Requires permission level of ALL.
      */
    inline def startRecording(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startRecording")().asInstanceOf[Unit]
    
    /**
      * Starts the Replay Buffer in OBS Studio.
      *
      * Requires permission level of ADVANCED or higher.
      */
    inline def startReplayBuffer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startReplayBuffer")().asInstanceOf[Unit]
    
    /**
      * Starts streaming in OBS Studio.
      *
      * Requires permission level of ALL.
      */
    inline def startStreaming(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startStreaming")().asInstanceOf[Unit]
    
    /**
      * Starts the VirtualCam in OBS Studio.
      *
      * Requires permission level of ALL.
      */
    inline def startVirtualcam(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startVirtualcam")().asInstanceOf[Unit]
    
    /**
      * Stops recording in OBS Studio.
      *
      * Requires permission level of ALL.
      */
    inline def stopRecording(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopRecording")().asInstanceOf[Unit]
    
    /**
      * Stops the Replay Buffer in OBS Studio.
      *
      * Requires permission level of ADVANCED or higher.
      */
    inline def stopReplayBuffer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopReplayBuffer")().asInstanceOf[Unit]
    
    /**
      * Stops streaming in OBS Studio.
      *
      * Requires permission level of ALL.
      */
    inline def stopStreaming(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopStreaming")().asInstanceOf[Unit]
    
    /**
      * Stops the VirtualCam in OBS Studio.
      *
      * Requires permission level of ALL.
      */
    inline def stopVirtualcam(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopVirtualcam")().asInstanceOf[Unit]
    
    /**
      * Unpauses recording in OBS Studio.
      *
      * Requires permission level of ALL.
      */
    inline def unpauseRecording(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unpauseRecording")().asInstanceOf[Unit]
  }
}
