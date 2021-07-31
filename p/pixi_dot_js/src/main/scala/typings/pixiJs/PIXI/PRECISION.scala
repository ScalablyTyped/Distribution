package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PRECISION extends StObject
/**
  * Constants that specify float precision in shaders.
  *
  * @name PRECISION
  * @memberof PIXI
  * @constant
  * @static
  * @enum {string}
  * @property {string} LOW='lowp'
  * @property {string} MEDIUM='mediump'
  * @property {string} HIGH='highp'
  */
@JSGlobal("PIXI.PRECISION")
@js.native
object PRECISION extends StObject {
  
  @js.native
  sealed trait HIGH
    extends StObject
       with PRECISION
  
  @js.native
  sealed trait LOW
    extends StObject
       with PRECISION
  
  @js.native
  sealed trait MEDIUM
    extends StObject
       with PRECISION
}
