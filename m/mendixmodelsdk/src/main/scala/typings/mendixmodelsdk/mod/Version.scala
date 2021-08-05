package typings.mendixmodelsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "Version")
@js.native
class Version protected ()
  extends typings.mendixmodelsdk.internalMod.Version {
  def this(major: Double, minor: Double, patch: Double) = this()
}
/* static members */
object Version {
  
  @JSImport("mendixmodelsdk", "Version")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mendixmodelsdk", "Version.memoisMap")
  @js.native
  def memoisMap: js.Any = js.native
  inline def memoisMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoisMap")(x.asInstanceOf[js.Any])
  
  /**
    * Parses and @returns the given string as a Version object.
    *
    * This function is memoised to keep memory and time consumption low,
    * given that only a handful of versions exist at any time anyway.
    */
  inline def parse(versionString: String): typings.mendixmodelsdk.versionChecksMod.Version = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(versionString.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.versionChecksMod.Version]
}
