package typings.npmcliConfig.anon

import typings.semver.classesSemverMod.^
import typings.semver.mod.CoerceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcoerce extends StObject {
  
  /**
    * Coerces a string to SemVer if possible
    */
  def apply(): ^ | Null = js.native
  def apply(version: String): ^ | Null = js.native
  def apply(version: String, options: CoerceOptions): ^ | Null = js.native
  def apply(version: Double): ^ | Null = js.native
  def apply(version: Double, options: CoerceOptions): ^ | Null = js.native
  def apply(version: Null, options: CoerceOptions): ^ | Null = js.native
  def apply(version: Unit, options: CoerceOptions): ^ | Null = js.native
  def apply(version: ^): ^ | Null = js.native
  def apply(version: ^, options: CoerceOptions): ^ | Null = js.native
}
