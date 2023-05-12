package typings.npmcliConfig.anon

import typings.semver.classesSemverMod.^
import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofrsort extends StObject {
  
  /**
    * Sorts an array of semver entries in descending order using `compareBuild()`.
    */
  def apply[T /* <: String | ^ */](list: js.Array[T]): js.Array[T] = js.native
  def apply[T /* <: String | ^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  def apply[T /* <: String | ^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
}
