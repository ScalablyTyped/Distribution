package typings.pathIsNetworkDrive

import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("path-is-network-drive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def matchNetworkDrive02(input: String): RegExpMatchArray = ^.asInstanceOf[js.Dynamic].applyDynamic("matchNetworkDrive02")(input.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray]
  
  inline def matchNetworkDriveRoot(input: String): RegExpMatchArray = ^.asInstanceOf[js.Dynamic].applyDynamic("matchNetworkDriveRoot")(input.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray]
  
  inline def pathIsNetworkDrive(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pathIsNetworkDrive")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
