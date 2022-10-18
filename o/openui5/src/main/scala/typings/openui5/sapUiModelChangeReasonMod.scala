package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelChangeReasonMod {
  
  /**
    * Change Reason for Model/ListBinding/TreeBinding.
    */
  @JSImport("sap/ui/model/ChangeReason", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ChangeReason & String] = js.native
    
    /* "add" */ val Add: typings.openui5.sapUiModelChangeReasonMod.ChangeReason.Add & String = js.native
    
    /* "binding" */ val Binding: typings.openui5.sapUiModelChangeReasonMod.ChangeReason.Binding & String = js.native
    
    /* "change" */ val Change: typings.openui5.sapUiModelChangeReasonMod.ChangeReason.Change & String = js.native
    
    /* "collapse" */ val Collapse: typings.openui5.sapUiModelChangeReasonMod.ChangeReason.Collapse & String = js.native
    
    /* "context" */ val Context: typings.openui5.sapUiModelChangeReasonMod.ChangeReason.Context & String = js.native
    
    /* "expand" */ val Expand: typings.openui5.sapUiModelChangeReasonMod.ChangeReason.Expand & String = js.native
    
    /* "filter" */ val Filter: typings.openui5.sapUiModelChangeReasonMod.ChangeReason.Filter & String = js.native
    
    /* "refresh" */ val Refresh: typings.openui5.sapUiModelChangeReasonMod.ChangeReason.Refresh & String = js.native
    
    /* "remove" */ val Remove: typings.openui5.sapUiModelChangeReasonMod.ChangeReason.Remove & String = js.native
    
    /* "sort" */ val Sort: typings.openui5.sapUiModelChangeReasonMod.ChangeReason.Sort & String = js.native
  }
  
  @js.native
  sealed trait ChangeReason extends StObject
  /**
    * Change Reason for Model/ListBinding/TreeBinding.
    */
  @JSImport("sap/ui/model/ChangeReason", "ChangeReason")
  @js.native
  object ChangeReason extends StObject {
    
    /**
      * A context was added to a binding.
      */
    @js.native
    sealed trait Add
      extends StObject
         with ChangeReason
    
    /**
      * Binding changes a model property value
      */
    @js.native
    sealed trait Binding
      extends StObject
         with ChangeReason
    
    /**
      * The list has changed
      */
    @js.native
    sealed trait Change
      extends StObject
         with ChangeReason
    
    /**
      * The tree node was collapsed
      */
    @js.native
    sealed trait Collapse
      extends StObject
         with ChangeReason
    
    /**
      * The list context has changed
      */
    @js.native
    sealed trait Context
      extends StObject
         with ChangeReason
    
    /**
      * The tree node was expanded
      */
    @js.native
    sealed trait Expand
      extends StObject
         with ChangeReason
    
    /**
      * The List was filtered
      */
    @js.native
    sealed trait Filter
      extends StObject
         with ChangeReason
    
    /**
      * The list was refreshed
      */
    @js.native
    sealed trait Refresh
      extends StObject
         with ChangeReason
    
    /**
      * A context was removed from a binding.
      */
    @js.native
    sealed trait Remove
      extends StObject
         with ChangeReason
    
    /**
      * The list was sorted
      */
    @js.native
    sealed trait Sort
      extends StObject
         with ChangeReason
  }
}
