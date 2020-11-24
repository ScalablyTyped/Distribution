package typings.multiaddr.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Protocols_ extends js.Object {
  
  var codes: NumberDictionary[Protocol] = js.native
  
  var names: StringDictionary[Protocol] = js.native
  
  def `object`(code: Double, size: Double, name: String): Protocol = js.native
  def `object`(code: Double, size: Double, name: String, resolvable: js.UndefOr[scala.Nothing], path: js.Any): Protocol = js.native
  def `object`(code: Double, size: Double, name: String, resolvable: js.Any): Protocol = js.native
  def `object`(code: Double, size: Double, name: String, resolvable: js.Any, path: js.Any): Protocol = js.native
  
  var table: NumberDictionary[Protocol] = js.native
}
