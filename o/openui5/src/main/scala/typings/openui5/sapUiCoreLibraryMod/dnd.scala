package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnd {
  
  @js.native
  sealed trait DropEffect extends StObject
  /**
    * @since 1.52.0
    *
    * Configuration options for visual drop effects that are given during a drag and drop operation.
    */
  @JSImport("sap/ui/core/library", "dnd.DropEffect")
  @js.native
  object DropEffect extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DropEffect & String] = js.native
    
    /**
      * A copy of the source item is made at the new location.
      */
    @js.native
    sealed trait Copy
      extends StObject
         with DropEffect
    /* "Copy" */ val Copy: typings.openui5.sapUiCoreLibraryMod.dnd.DropEffect.Copy & String = js.native
    
    /**
      * A link is established to the source at the new location.
      */
    @js.native
    sealed trait Link
      extends StObject
         with DropEffect
    /* "Link" */ val Link: typings.openui5.sapUiCoreLibraryMod.dnd.DropEffect.Link & String = js.native
    
    /**
      * An item is moved to a new location.
      */
    @js.native
    sealed trait Move
      extends StObject
         with DropEffect
    /* "Move" */ val Move: typings.openui5.sapUiCoreLibraryMod.dnd.DropEffect.Move & String = js.native
    
    /**
      * The item cannot be dropped.
      */
    @js.native
    sealed trait None
      extends StObject
         with DropEffect
    /* "None" */ val None: typings.openui5.sapUiCoreLibraryMod.dnd.DropEffect.None & String = js.native
  }
  
  @js.native
  sealed trait DropLayout extends StObject
  /**
    * @since 1.52.0
    *
    * Configuration options for the layout of the droppable controls.
    */
  @JSImport("sap/ui/core/library", "dnd.DropLayout")
  @js.native
  object DropLayout extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DropLayout & String] = js.native
    
    /**
      * Default {@link sap.ui.core.Element.extend layout} definition of the aggregations.
      */
    @js.native
    sealed trait Default
      extends StObject
         with DropLayout
    /* "Default" */ val Default: typings.openui5.sapUiCoreLibraryMod.dnd.DropLayout.Default & String = js.native
    
    /**
      * Droppable controls are arranged horizontally.
      */
    @js.native
    sealed trait Horizontal
      extends StObject
         with DropLayout
    /* "Horizontal" */ val Horizontal: typings.openui5.sapUiCoreLibraryMod.dnd.DropLayout.Horizontal & String = js.native
    
    /**
      * Droppable controls are arranged vertically.
      */
    @js.native
    sealed trait Vertical
      extends StObject
         with DropLayout
    /* "Vertical" */ val Vertical: typings.openui5.sapUiCoreLibraryMod.dnd.DropLayout.Vertical & String = js.native
  }
  
  @js.native
  sealed trait DropPosition extends StObject
  /**
    * @since 1.52.0
    *
    * Configuration options for drop positions.
    */
  @JSImport("sap/ui/core/library", "dnd.DropPosition")
  @js.native
  object DropPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DropPosition & String] = js.native
    
    /**
      * Drop between the controls.
      */
    @js.native
    sealed trait Between
      extends StObject
         with DropPosition
    /* "Between" */ val Between: typings.openui5.sapUiCoreLibraryMod.dnd.DropPosition.Between & String = js.native
    
    /**
      * Drop on the control.
      */
    @js.native
    sealed trait On
      extends StObject
         with DropPosition
    /* "On" */ val On: typings.openui5.sapUiCoreLibraryMod.dnd.DropPosition.On & String = js.native
    
    /**
      * Drop on the control or between the controls.
      */
    @js.native
    sealed trait OnOrBetween
      extends StObject
         with DropPosition
    /* "OnOrBetween" */ val OnOrBetween: typings.openui5.sapUiCoreLibraryMod.dnd.DropPosition.OnOrBetween & String = js.native
  }
  
  @js.native
  sealed trait RelativeDropPosition extends StObject
  /**
    * @since 1.100.0
    *
    * Drop positions relative to a dropped element.
    */
  @JSImport("sap/ui/core/library", "dnd.RelativeDropPosition")
  @js.native
  object RelativeDropPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RelativeDropPosition & String] = js.native
    
    /**
      * Drop after the control.
      */
    @js.native
    sealed trait After
      extends StObject
         with RelativeDropPosition
    /* "After" */ val After: typings.openui5.sapUiCoreLibraryMod.dnd.RelativeDropPosition.After & String = js.native
    
    /**
      * Drop before the control.
      */
    @js.native
    sealed trait Before
      extends StObject
         with RelativeDropPosition
    /* "Before" */ val Before: typings.openui5.sapUiCoreLibraryMod.dnd.RelativeDropPosition.Before & String = js.native
    
    /**
      * Drop on the control.
      */
    @js.native
    sealed trait On
      extends StObject
         with RelativeDropPosition
    /* "On" */ val On: typings.openui5.sapUiCoreLibraryMod.dnd.RelativeDropPosition.On & String = js.native
  }
  
  /**
    * @since 1.52.0
    *
    * Marker interface for drag configuration providing information about the source of the drag operation.
    */
  trait IDragInfo extends StObject {
    
    var __implements__sap_ui_core_dnd_IDragInfo: Boolean
  }
  object IDragInfo {
    
    inline def apply(__implements__sap_ui_core_dnd_IDragInfo: Boolean): IDragInfo = {
      val __obj = js.Dynamic.literal(__implements__sap_ui_core_dnd_IDragInfo = __implements__sap_ui_core_dnd_IDragInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDragInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDragInfo] (val x: Self) extends AnyVal {
      
      inline def set__implements__sap_ui_core_dnd_IDragInfo(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_dnd_IDragInfo", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @since 1.52.0
    *
    * Marker interface for drop configuration providing information about the target of the drop operation.
    */
  trait IDropInfo extends StObject {
    
    var __implements__sap_ui_core_dnd_IDropInfo: Boolean
  }
  object IDropInfo {
    
    inline def apply(__implements__sap_ui_core_dnd_IDropInfo: Boolean): IDropInfo = {
      val __obj = js.Dynamic.literal(__implements__sap_ui_core_dnd_IDropInfo = __implements__sap_ui_core_dnd_IDropInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDropInfo] (val x: Self) extends AnyVal {
      
      inline def set__implements__sap_ui_core_dnd_IDropInfo(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_dnd_IDropInfo", value.asInstanceOf[js.Any])
    }
  }
}
