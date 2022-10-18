package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkConversion extends StObject
@JSImport("sap/m/library", "LinkConversion")
@js.native
object LinkConversion extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LinkConversion & String] = js.native
  
  /**
    * Valid links with protocols, such as http, https, ftp and those starting with the string "www".
    */
  @js.native
  sealed trait All
    extends StObject
       with LinkConversion
  /* "All" */ val All: typings.openui5.sapMLibraryMod.LinkConversion.All & String = js.native
  
  /**
    * Default mode (no conversion).
    */
  @js.native
  sealed trait None
    extends StObject
       with LinkConversion
  /* "None" */ val None: typings.openui5.sapMLibraryMod.LinkConversion.None & String = js.native
  
  /**
    * Valid links with protocols, such as http, https, ftp.
    */
  @js.native
  sealed trait ProtocolOnly
    extends StObject
       with LinkConversion
  /* "ProtocolOnly" */ val ProtocolOnly: typings.openui5.sapMLibraryMod.LinkConversion.ProtocolOnly & String = js.native
}
