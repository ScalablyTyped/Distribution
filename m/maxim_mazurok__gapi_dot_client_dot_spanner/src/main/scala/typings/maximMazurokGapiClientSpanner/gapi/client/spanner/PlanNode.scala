package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanNode extends js.Object {
  
  /** List of child node `index`es and their relationship to this parent. */
  var childLinks: js.UndefOr[js.Array[ChildLink]] = js.native
  
  /** The display name for the node. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The execution statistics associated with the node, contained in a group of key-value pairs. Only present if the plan was returned as a result of a profile query. For example, number
    * of executions, number of rows/time per execution etc.
    */
  var executionStats: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.PlanNode with TopLevel[js.Any]
  ] = js.native
  
  /** The `PlanNode`'s index in node list. */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Used to determine the type of node. May be needed for visualizing different kinds of nodes differently. For example, If the node is a SCALAR node, it will have a condensed
    * representation which can be used to directly embed a description of the node in its parent.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Attributes relevant to the node contained in a group of key-value pairs. For example, a Parameter Reference node could have the following information in its metadata: {
    * "parameter_reference": "param1", "parameter_type": "array" }
    */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.PlanNode with TopLevel[js.Any]
  ] = js.native
  
  /** Condensed representation for SCALAR nodes. */
  var shortRepresentation: js.UndefOr[ShortRepresentation] = js.native
}
object PlanNode {
  
  @scala.inline
  def apply(): PlanNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanNode]
  }
  
  @scala.inline
  implicit class PlanNodeOps[Self <: PlanNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildLinksVarargs(value: ChildLink*): Self = this.set("childLinks", js.Array(value :_*))
    
    @scala.inline
    def setChildLinks(value: js.Array[ChildLink]): Self = this.set("childLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildLinks: Self = this.set("childLinks", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setExecutionStats(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.PlanNode with TopLevel[js.Any]
    ): Self = this.set("executionStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionStats: Self = this.set("executionStats", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.PlanNode with TopLevel[js.Any]
    ): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setShortRepresentation(value: ShortRepresentation): Self = this.set("shortRepresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortRepresentation: Self = this.set("shortRepresentation", js.undefined)
  }
}
