package typings.npmcliArborist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.npmcliArborist.anon.AuditReportVersion
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditReport
  extends StObject
     with Map[String, Vuln] {
  
  var error: js.Error | Null = js.native
  
  var options: NormalizedOptions = js.native
  
  var report: StringDictionary[Advisory] = js.native
  
  def run(): js.Promise[AuditReport] = js.native
  
  def set(key: scala.Nothing, value: scala.Nothing): scala.Nothing = js.native
  
  def toJSON(): AuditReportVersion = js.native
  
  var topVulns: Map[String, Vuln] = js.native
  
  var tree: Node = js.native
}
