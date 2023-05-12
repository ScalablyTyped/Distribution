package typings.npmcliConfig.anon

import typings.semver.classesSemverMod.^
import typings.semver.mod.RangeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofmaxSatisfying extends StObject {
  
  /**
    * Return the highest version in the list that satisfies the range, or null if none of them do.
    */
  def apply[T /* <: String | ^ */](versions: js.Array[T], range: String): T | Null = js.native
  def apply[T /* <: String | ^ */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = js.native
  def apply[T /* <: String | ^ */](versions: js.Array[T], range: String, optionsOrLoose: RangeOptions): T | Null = js.native
  def apply[T /* <: String | ^ */](versions: js.Array[T], range: typings.semver.classesRangeMod.^): T | Null = js.native
  def apply[T /* <: String | ^ */](versions: js.Array[T], range: typings.semver.classesRangeMod.^, optionsOrLoose: Boolean): T | Null = js.native
  def apply[T /* <: String | ^ */](versions: js.Array[T], range: typings.semver.classesRangeMod.^, optionsOrLoose: RangeOptions): T | Null = js.native
}
