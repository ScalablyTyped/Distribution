package typings.phaser.Phaser.Plugins

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These plugins are created in Scene.Systems in addition to the CoreScenePlugins.
  * 
  * You can elect not to have these plugins by either creating a DefaultPlugins object as part
  * of the Game Config, by creating a Plugins object as part of a Scene Config, or by modifying this array
  * and building your own bundle.
  * 
  * They are optionally exposed in the Scene as well (see the InjectionMap for details)
  * 
  * They are always created in the order in which they appear in the array.
  */
@JSGlobal("Phaser.Plugins.DefaultScene")
@js.native
object DefaultScene
  extends TopLevel[js.Array[js.Any]]

