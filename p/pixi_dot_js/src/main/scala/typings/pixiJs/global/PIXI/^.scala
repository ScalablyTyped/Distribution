package typings.pixiJs.global.PIXI

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI")
@js.native
object ^ extends js.Object {
  
  /**
    * Regexp for data URI.
    * Based on: {@link https://github.com/ragingwind/data-uri-regex}
    *
    * @static
    * @constant {RegExp|string} DATA_URI
    * @memberof PIXI
    * @example data:image/png;base64
    */
  var DATA_URI: RegExp | String = js.native
  
  /**
    * Conversion factor for converting degrees to radians.
    *
    * @static
    * @constant {number} DEG_TO_RAD
    * @memberof PIXI
    */
  var DEG_TO_RAD: Double = js.native
  
  /**
    * Two Pi.
    *
    * @static
    * @constant {number} PI_2
    * @memberof PIXI
    */
  var PI_2: Double = js.native
  
  /**
    * Conversion factor for converting radians to degrees.
    *
    * @static
    * @constant {number} RAD_TO_DEG
    * @memberof PIXI
    */
  var RAD_TO_DEG: Double = js.native
  
  /**
    * String of the current PIXI version.
    *
    * @static
    * @constant
    * @memberof PIXI
    * @name VERSION
    * @type {string}
    */
  var VERSION: String = js.native
  
  /**
    * Default filter vertex shader
    * @memberof PIXI
    * @member {string} defaultFilterVertex
    */
  var defaultFilterVertex: String = js.native
  
  /**
    * Default vertex shader
    * @memberof PIXI
    * @member {string} defaultVertex
    */
  var defaultVertex: String = js.native
}
