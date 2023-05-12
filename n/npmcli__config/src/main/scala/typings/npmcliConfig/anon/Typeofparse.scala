package typings.npmcliConfig.anon

import typings.semver.classesSemverMod.^
import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofparse extends StObject {
  
  /**
    * Return the parsed version as a SemVer object, or null if it's not valid.
    */
  def apply(): ^ | Null = js.native
  def apply(version: String): ^ | Null = js.native
  def apply(version: String, optionsOrLoose: Boolean): ^ | Null = js.native
  def apply(version: String, optionsOrLoose: Options): ^ | Null = js.native
  def apply(version: Null, optionsOrLoose: Boolean): ^ | Null = js.native
  def apply(version: Null, optionsOrLoose: Options): ^ | Null = js.native
  def apply(version: Unit, optionsOrLoose: Boolean): ^ | Null = js.native
  def apply(version: Unit, optionsOrLoose: Options): ^ | Null = js.native
  def apply(version: ^): ^ | Null = js.native
  def apply(version: ^, optionsOrLoose: Boolean): ^ | Null = js.native
  def apply(version: ^, optionsOrLoose: Options): ^ | Null = js.native
}
