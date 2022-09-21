package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.IAppWindow
import typings.microsoftteams.microsoftTeams.TaskInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with the task module-specific part of the SDK.
  * This object is usable only on the content frame.
  */
object tasks {
  
  @JSGlobal("microsoftTeams.tasks")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Allows an app to open the task module.
    * @param taskInfo An object containing the parameters of the task module
    * @param submitHandler Handler to call when the task module is completed
    */
  inline def startTask(taskInfo: TaskInfo): IAppWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("startTask")(taskInfo.asInstanceOf[js.Any]).asInstanceOf[IAppWindow]
  inline def startTask(taskInfo: TaskInfo, submitHandler: js.Function2[/* err */ String, /* result */ String, Unit]): IAppWindow = (^.asInstanceOf[js.Dynamic].applyDynamic("startTask")(taskInfo.asInstanceOf[js.Any], submitHandler.asInstanceOf[js.Any])).asInstanceOf[IAppWindow]
  
  /**
    * Submit the task module.
    * @param result Contains the result to be sent to the bot or the app. Typically a JSON object or a serialized version of it
    * @param appIds Helps to validate that the call originates from the same appId as the one that invoked the task module
    */
  inline def submitTask(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("submitTask")().asInstanceOf[Unit]
  inline def submitTask(result: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("submitTask")(result.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def submitTask(result: String, appIds: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("submitTask")(result.asInstanceOf[js.Any], appIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def submitTask(result: String, appIds: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("submitTask")(result.asInstanceOf[js.Any], appIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def submitTask(result: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("submitTask")(result.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def submitTask(result: js.Object, appIds: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("submitTask")(result.asInstanceOf[js.Any], appIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def submitTask(result: js.Object, appIds: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("submitTask")(result.asInstanceOf[js.Any], appIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def submitTask(result: Unit, appIds: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("submitTask")(result.asInstanceOf[js.Any], appIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def submitTask(result: Unit, appIds: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("submitTask")(result.asInstanceOf[js.Any], appIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Update height/width task info properties.
    * @param taskInfo An object containing width and height properties
    */
  inline def updateTask(taskInfo: TaskInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateTask")(taskInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
