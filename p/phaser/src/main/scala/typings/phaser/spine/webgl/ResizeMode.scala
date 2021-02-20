package typings.phaser.spine.webgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResizeMode extends StObject
@JSGlobal("spine.webgl.ResizeMode")
@js.native
object ResizeMode extends StObject {
  
  @js.native
  sealed trait Expand extends ResizeMode
  
  @js.native
  sealed trait Fit extends ResizeMode
  
  @js.native
  sealed trait Stretch extends ResizeMode
}
