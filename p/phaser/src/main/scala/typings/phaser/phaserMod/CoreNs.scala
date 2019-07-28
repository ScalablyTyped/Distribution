package typings.phaser.phaserMod

import typings.phaser.PhaserNs.TypesNs.CoreNs.FPSConfig
import typings.phaser.PhaserNs.TypesNs.CoreNs.GameConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Core")
@js.native
object CoreNs extends js.Object {
  /**
    * The active game configuration settings, parsed from a {@link Phaser.Types.Core.GameConfig} object.
    */
  @js.native
  /**
    * 
    * @param GameConfig The configuration object for your Phaser Game instance.
    */
  class Config ()
    extends typings.phaser.PhaserNs.CoreNs.Config {
    def this(GameConfig: GameConfig) = this()
  }
  
  /**
    * [description]
    */
  @js.native
  class TimeStep protected ()
    extends typings.phaser.PhaserNs.CoreNs.TimeStep {
    /**
      * 
      * @param game A reference to the Phaser.Game instance that owns this Time Step.
      */
    def this(game: typings.phaser.PhaserNs.Game, config: FPSConfig) = this()
  }
  
  /**
    * Called automatically by Phaser.Game and responsible for creating the renderer it will use.
    * 
    * Relies upon two webpack global flags to be defined: `WEBGL_RENDERER` and `CANVAS_RENDERER` during build time, but not at run-time.
    * @param game The Phaser.Game instance on which the renderer will be set.
    */
  def CreateRenderer(game: typings.phaser.PhaserNs.Game): Unit = js.native
  /**
    * Called automatically by Phaser.Game and responsible for creating the console.log debug header.
    * 
    * You can customize or disable the header via the Game Config object.
    * @param game The Phaser.Game instance which will output this debug header.
    */
  def DebugHeader(game: typings.phaser.PhaserNs.Game): Unit = js.native
  /**
    * The Visibility Handler is responsible for listening out for document level visibility change events.
    * This includes `visibilitychange` if the browser supports it, and blur and focus events. It then uses
    * the provided Event Emitter and fires the related events.
    * @param game The Game instance this Visibility Handler is working on.
    */
  def VisibilityHandler(game: typings.phaser.PhaserNs.Game): Unit = js.native
  @JSName("Events")
  @js.native
  object EventsNs extends js.Object {
    /**
      * The Game Blur Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the window in which the Game instance is embedded
      * enters a blurred state. The blur event is raised when the window loses focus. This can happen if a user swaps
      * tab, or if they simply remove focus from the browser to another app.
      */
    val BLUR: js.Any = js.native
    /**
      * The Game Boot Event.
      * 
      * This event is dispatched when the Phaser Game instance has finished booting, but before it is ready to start running.
      * The global systems use this event to know when to set themselves up, dispatching their own `ready` events as required.
      */
    val BOOT: js.Any = js.native
    /**
      * The Game Destroy Event.
      * 
      * This event is dispatched when the game instance has been told to destroy itself.
      * Lots of internal systems listen to this event in order to clear themselves out.
      * Custom plugins and game code should also do the same.
      */
    val DESTROY: js.Any = js.native
    /**
      * The Game Focus Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the window in which the Game instance is embedded
      * enters a focused state. The focus event is raised when the window re-gains focus, having previously lost it.
      */
    val FOCUS: js.Any = js.native
    /**
      * The Game Hidden Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the document in which the Game instance is embedded
      * enters a hidden state. Only browsers that support the Visibility API will cause this event to be emitted.
      * 
      * In most modern browsers, when the document enters a hidden state, the Request Animation Frame and setTimeout, which
      * control the main game loop, will automatically pause. There is no way to stop this from happening. It is something
      * your game should account for in its own code, should the pause be an issue (i.e. for multiplayer games)
      */
    val HIDDEN: js.Any = js.native
    /**
      * The Game Pause Event.
      * 
      * This event is dispatched when the Game loop enters a paused state, usually as a result of the Visibility Handler.
      */
    val PAUSE: js.Any = js.native
    /**
      * The Game Post-Render Event.
      * 
      * This event is dispatched right at the end of the render process.
      * 
      * Every Scene will have rendered and been drawn to the canvas by the time this event is fired.
      * Use it for any last minute post-processing before the next game step begins.
      */
    val POST_RENDER: js.Any = js.native
    /**
      * The Game Post-Step Event.
      * 
      * This event is dispatched after the Scene Manager has updated.
      * Hook into it from plugins or systems that need to do things before the render starts.
      */
    val POST_STEP: js.Any = js.native
    /**
      * The Game Pre-Render Event.
      * 
      * This event is dispatched immediately before any of the Scenes have started to render.
      * 
      * The renderer will already have been initialized this frame, clearing itself and preparing to receive the Scenes for rendering, but it won't have actually drawn anything yet.
      */
    val PRE_RENDER: js.Any = js.native
    /**
      * The Game Pre-Step Event.
      * 
      * This event is dispatched before the main Game Step starts. By this point in the game cycle none of the Scene updates have yet happened.
      * Hook into it from plugins or systems that need to update before the Scene Manager does.
      */
    val PRE_STEP: js.Any = js.native
    /**
      * The Game Ready Event.
      * 
      * This event is dispatched when the Phaser Game instance has finished booting, the Texture Manager is fully ready,
      * and all local systems are now able to start.
      */
    val READY: js.Any = js.native
    /**
      * The Game Resume Event.
      * 
      * This event is dispatched when the game loop leaves a paused state and resumes running.
      */
    val RESUME: js.Any = js.native
    /**
      * The Game Step Event.
      * 
      * This event is dispatched after the Game Pre-Step and before the Scene Manager steps.
      * Hook into it from plugins or systems that need to update before the Scene Manager does, but after the core Systems have.
      */
    val STEP: js.Any = js.native
    /**
      * The Game Visible Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the document in which the Game instance is embedded
      * enters a visible state, previously having been hidden.
      * 
      * Only browsers that support the Visibility API will cause this event to be emitted.
      */
    val VISIBLE: js.Any = js.native
  }
  
}

