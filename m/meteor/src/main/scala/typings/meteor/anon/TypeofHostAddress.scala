package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable1
import typings.mongodb.mod.HostAddress
import typings.node.dnsMod.SrvRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHostAddress
  extends StObject
     with Instantiable1[/* hostString */ String, HostAddress] {
  
  def fromHostPort(host: String, port: Double): HostAddress = js.native
  
  def fromSrvRecord(param0: SrvRecord): HostAddress = js.native
  
  def fromString(s: String): HostAddress = js.native
}
