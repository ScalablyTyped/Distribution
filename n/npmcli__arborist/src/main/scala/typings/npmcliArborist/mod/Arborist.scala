package typings.npmcliArborist.mod

import typings.node.eventsMod.EventEmitter
import typings.npmcliArborist.anon.BuildIdealTreeOptionsfixb
import typings.npmcliArborist.anon.BuildIdealTreeOptionsfixf
import typings.npmcliArborist.anon.BuildIdealTreeOptionsfixt
import typings.npmcliArborist.anon.OmitReifyOptionspreferDed
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arborist extends EventEmitter {
  
  var actualTree: js.UndefOr[Node | Null] = js.native
  
  def audit(): js.Promise[AuditReport] = js.native
  def audit(options: BuildIdealTreeOptionsfixb): js.Promise[Node | AuditReport] = js.native
  def audit(options: BuildIdealTreeOptionsfixf): js.Promise[AuditReport] = js.native
  def audit(options: BuildIdealTreeOptionsfixt): js.Promise[Node] = js.native
  
  var auditReport: js.UndefOr[AuditReport | Null] = js.native
  
  def buildIdealTree(): js.Promise[Node] = js.native
  def buildIdealTree(options: BuildIdealTreeOptions): js.Promise[Node] = js.native
  
  var cache: String = js.native
  
  def dedupe(): js.Promise[Node] = js.native
  def dedupe(options: OmitReifyOptionspreferDed): js.Promise[Node] = js.native
  
  var diff: Diff | Null = js.native
  
  def explicitRequests: Set[ExplicitRequest] = js.native
  
  var idealTree: Node | Null = js.native
  
  var installLinks: Boolean = js.native
  
  var legacyPeerDeps: Boolean = js.native
  
  def loadActual(): js.Promise[Node] = js.native
  def loadActual(options: Options): js.Promise[Node] = js.native
  
  def loadVirtual(): js.Promise[Node] = js.native
  def loadVirtual(options: Options): js.Promise[Node] = js.native
  
  var options: NormalizedOptions = js.native
  
  var path: String = js.native
  
  var registry: String = js.native
  
  def reify(): js.Promise[Node] = js.native
  def reify(options: ReifyOptions): js.Promise[Node] = js.native
  
  var replaceRegistryHost: js.UndefOr[Boolean] = js.native
  
  var scriptsRun: Set[ScriptRun] = js.native
  
  var virtualTree: js.UndefOr[Node | Null] = js.native
}
object Arborist {
  
  inline def apply: Arborist = ^.asInstanceOf[js.Dynamic].selectDynamic("Arborist").asInstanceOf[Arborist]
}
