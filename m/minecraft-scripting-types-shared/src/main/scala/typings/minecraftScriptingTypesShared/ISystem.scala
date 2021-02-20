package typings.minecraftScriptingTypesShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISystem[TSystem] extends ISystemBase {
  
  /**
    * This is the first method that gets called immediately after the system is registered. It will run as soon as the script loads at world start.
    * You can use this to set up the environment for your script: register custom components and events, sign up event listeners, etc. This will run BEFORE the world is ready and the player has been added to it, so you shouldn't try to spawn any entities here!
    */
  var initialize: js.UndefOr[js.ThisFunction0[/* this */ TSystem, Unit]] = js.native
  
  /**
    * This method gets called when the Minecraft Script Engine is shutting down. For the client this is when they leave the world; for the server this is after the last player has exited the world.
    */
  var shutdown: js.UndefOr[js.ThisFunction0[/* this */ TSystem, Unit]] = js.native
  
  /**
    * This method gets called once every game tick. The server aims to be 200 times per second, while client aims to be 60, 
    * but neither one is guaranteed and can vary with performance. This is a good place to get, check, and react to component changes.
    */
  var update: js.UndefOr[js.ThisFunction0[/* this */ TSystem, Unit]] = js.native
}
