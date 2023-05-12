package typings.npmcliConfig.anon

import typings.semver.classesRangeMod.^
import typings.semver.mod.RangeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofvalidRange extends StObject {
  
  /**
    * Return the valid range or null if it's not valid
    */
  def apply(): String | Null = js.native
  def apply(range: String): String | Null = js.native
  def apply(range: String, optionsOrLoose: Boolean): String | Null = js.native
  def apply(range: String, optionsOrLoose: RangeOptions): String | Null = js.native
  def apply(range: Null, optionsOrLoose: Boolean): String | Null = js.native
  def apply(range: Null, optionsOrLoose: RangeOptions): String | Null = js.native
  def apply(range: Unit, optionsOrLoose: Boolean): String | Null = js.native
  def apply(range: Unit, optionsOrLoose: RangeOptions): String | Null = js.native
  def apply(range: ^): String | Null = js.native
  def apply(range: ^, optionsOrLoose: Boolean): String | Null = js.native
  def apply(range: ^, optionsOrLoose: RangeOptions): String | Null = js.native
}
