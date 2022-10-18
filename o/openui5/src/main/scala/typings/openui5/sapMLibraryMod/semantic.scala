package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semantic {
  
  @js.native
  sealed trait SemanticRuleSetType extends StObject
  /**
    * @SINCE 1.44
    *
    * Declares the type of semantic ruleset that will govern the styling and positioning of semantic content.
    */
  @JSImport("sap/m/library", "semantic.SemanticRuleSetType")
  @js.native
  object SemanticRuleSetType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SemanticRuleSetType & String] = js.native
    
    /**
      * The default ruleset type, for which the Share Menu is always in the footer of the page.
      */
    @js.native
    sealed trait Classic
      extends StObject
         with SemanticRuleSetType
    /* "Classic" */ val Classic: typings.openui5.sapMLibraryMod.semantic.SemanticRuleSetType.Classic & String = js.native
    
    /**
      * Offers an optimized user experience, with displaying the Share Menu in the header, rather than the footer,
      * for Fullscreen mode.
      */
    @js.native
    sealed trait Optimized
      extends StObject
         with SemanticRuleSetType
    /* "Optimized" */ val Optimized: typings.openui5.sapMLibraryMod.semantic.SemanticRuleSetType.Optimized & String = js.native
  }
  
  /**
    * Marker interface for controls which are suitable as items of the filter aggregation of sap.m.Semantic.MasterPage.
    */
  trait IFilter extends StObject {
    
    var __implements__sap_m_semantic_IFilter: Boolean
  }
  object IFilter {
    
    inline def apply(__implements__sap_m_semantic_IFilter: Boolean): IFilter = {
      val __obj = js.Dynamic.literal(__implements__sap_m_semantic_IFilter = __implements__sap_m_semantic_IFilter.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFilter]
    }
    
    extension [Self <: IFilter](x: Self) {
      
      inline def set__implements__sap_m_semantic_IFilter(value: Boolean): Self = StObject.set(x, "__implements__sap_m_semantic_IFilter", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Marker interface for controls which are suitable as items of the group aggregation of sap.m.Semantic.MasterPage.
    */
  trait IGroup extends StObject {
    
    var __implements__sap_m_semantic_IGroup: Boolean
  }
  object IGroup {
    
    inline def apply(__implements__sap_m_semantic_IGroup: Boolean): IGroup = {
      val __obj = js.Dynamic.literal(__implements__sap_m_semantic_IGroup = __implements__sap_m_semantic_IGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroup]
    }
    
    extension [Self <: IGroup](x: Self) {
      
      inline def set__implements__sap_m_semantic_IGroup(value: Boolean): Self = StObject.set(x, "__implements__sap_m_semantic_IGroup", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Marker interface for controls which are suitable as items of the sort aggregation of sap.m.Semantic.MasterPage.
    */
  trait ISort extends StObject {
    
    var __implements__sap_m_semantic_ISort: Boolean
  }
  object ISort {
    
    inline def apply(__implements__sap_m_semantic_ISort: Boolean): ISort = {
      val __obj = js.Dynamic.literal(__implements__sap_m_semantic_ISort = __implements__sap_m_semantic_ISort.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISort]
    }
    
    extension [Self <: ISort](x: Self) {
      
      inline def set__implements__sap_m_semantic_ISort(value: Boolean): Self = StObject.set(x, "__implements__sap_m_semantic_ISort", value.asInstanceOf[js.Any])
    }
  }
}
