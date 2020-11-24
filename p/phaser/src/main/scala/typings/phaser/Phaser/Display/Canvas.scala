package typings.phaser.Phaser.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.Display.Canvas")
@js.native
object Canvas extends js.Object {
  
  /**
    * The CanvasPool is a global static object, that allows Phaser to recycle and pool 2D Context Canvas DOM elements.
    * It does not pool WebGL Contexts, because once the context options are set they cannot be modified again, 
    * which is useless for some of the Phaser pipelines / renderer.
    * 
    * This singleton is instantiated as soon as Phaser loads, before a Phaser.Game instance has even been created.
    * Which means all instances of Phaser Games on the same page can share the one single pool.
    */
  @js.native
  object CanvasPool extends js.Object
}
