package typings.npmcliConfig.anon

import typings.semver.classesSemverMod.^
import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofprerelease extends StObject {
  
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  def apply(version: String): (js.Array[String | Double]) | Null = js.native
  def apply(version: String, optionsOrLoose: Boolean): (js.Array[String | Double]) | Null = js.native
  def apply(version: String, optionsOrLoose: Options): (js.Array[String | Double]) | Null = js.native
  def apply(version: ^): (js.Array[String | Double]) | Null = js.native
  def apply(version: ^, optionsOrLoose: Boolean): (js.Array[String | Double]) | Null = js.native
  def apply(version: ^, optionsOrLoose: Options): (js.Array[String | Double]) | Null = js.native
}
