package typings.phonegap

import typings.phonegap.phonegapStrings.bluetooth
import typings.phonegap.phonegapStrings.cellular
import typings.phonegap.phonegapStrings.ethernet
import typings.phonegap.phonegapStrings.mixed
import typings.phonegap.phonegapStrings.none
import typings.phonegap.phonegapStrings.other
import typings.phonegap.phonegapStrings.unknown
import typings.phonegap.phonegapStrings.wifi
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection
  extends StObject
     with EventTarget {
  
  var CELL_2G: Double = js.native
  
  var CELL_3G: Double = js.native
  
  var CELL_4G: Double = js.native
  
  var ETHERNET: Double = js.native
  
  var NONE: Double = js.native
  
  var UNKNOWN: Double = js.native
  
  var WIFI: Double = js.native
  
  var `type`: bluetooth | cellular | ethernet | mixed | none | other | unknown | wifi = js.native
}
