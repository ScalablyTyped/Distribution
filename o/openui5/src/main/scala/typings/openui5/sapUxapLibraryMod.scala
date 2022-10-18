package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapLibraryMod {
  
  @js.native
  sealed trait BlockBaseFormAdjustment extends StObject
  @JSImport("sap/uxap/library", "BlockBaseFormAdjustment")
  @js.native
  object BlockBaseFormAdjustment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BlockBaseFormAdjustment & String] = js.native
    
    /**
      * Any form within the block will be automatically adjusted to have as many columns as the colspan of its
      * parent block.
      */
    @js.native
    sealed trait BlockColumns
      extends StObject
         with BlockBaseFormAdjustment
    /* "BlockColumns" */ val BlockColumns: typings.openui5.sapUxapLibraryMod.BlockBaseFormAdjustment.BlockColumns & String = js.native
    
    /**
      * No automatic adjustment of forms.
      */
    @js.native
    sealed trait None
      extends StObject
         with BlockBaseFormAdjustment
    /* "None" */ val None: typings.openui5.sapUxapLibraryMod.BlockBaseFormAdjustment.None & String = js.native
    
    /**
      * Any form within the block will be automatically adjusted to have only one column.
      */
    @js.native
    sealed trait OneColumn
      extends StObject
         with BlockBaseFormAdjustment
    /* "OneColumn" */ val OneColumn: typings.openui5.sapUxapLibraryMod.BlockBaseFormAdjustment.OneColumn & String = js.native
  }
  
  @js.native
  sealed trait Importance extends StObject
  @JSImport("sap/uxap/library", "Importance")
  @js.native
  object Importance extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Importance & String] = js.native
    
    /**
      * High importance of the content.
      */
    @js.native
    sealed trait High
      extends StObject
         with Importance
    /* "High" */ val High: typings.openui5.sapUxapLibraryMod.Importance.High & String = js.native
    
    /**
      * Low importance of the content.
      */
    @js.native
    sealed trait Low
      extends StObject
         with Importance
    /* "Low" */ val Low: typings.openui5.sapUxapLibraryMod.Importance.Low & String = js.native
    
    /**
      * Medium importance of the content.
      */
    @js.native
    sealed trait Medium
      extends StObject
         with Importance
    /* "Medium" */ val Medium: typings.openui5.sapUxapLibraryMod.Importance.Medium & String = js.native
  }
  
  @js.native
  sealed trait ObjectPageConfigurationMode extends StObject
  @JSImport("sap/uxap/library", "ObjectPageConfigurationMode")
  @js.native
  object ObjectPageConfigurationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ObjectPageConfigurationMode & String] = js.native
    
    /**
      * Determines the JSON model.
      */
    @js.native
    sealed trait JsonModel
      extends StObject
         with ObjectPageConfigurationMode
    /* "JsonModel" */ val JsonModel: typings.openui5.sapUxapLibraryMod.ObjectPageConfigurationMode.JsonModel & String = js.native
    
    /**
      * Determines the JSON URL.
      */
    @js.native
    sealed trait JsonURL
      extends StObject
         with ObjectPageConfigurationMode
    /* "JsonURL" */ val JsonURL: typings.openui5.sapUxapLibraryMod.ObjectPageConfigurationMode.JsonURL & String = js.native
  }
  
  @js.native
  sealed trait ObjectPageHeaderDesign extends StObject
  @JSImport("sap/uxap/library", "ObjectPageHeaderDesign")
  @js.native
  object ObjectPageHeaderDesign extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ObjectPageHeaderDesign & String] = js.native
    
    /**
      * Dark theme for the `ObjectPageHeader`.
      */
    @js.native
    sealed trait Dark
      extends StObject
         with ObjectPageHeaderDesign
    /* "Dark" */ val Dark: typings.openui5.sapUxapLibraryMod.ObjectPageHeaderDesign.Dark & String = js.native
    
    /**
      * Light theme for the `ObjectPageHeader`.
      */
    @js.native
    sealed trait Light
      extends StObject
         with ObjectPageHeaderDesign
    /* "Light" */ val Light: typings.openui5.sapUxapLibraryMod.ObjectPageHeaderDesign.Light & String = js.native
  }
  
  @js.native
  sealed trait ObjectPageHeaderPictureShape extends StObject
  @JSImport("sap/uxap/library", "ObjectPageHeaderPictureShape")
  @js.native
  object ObjectPageHeaderPictureShape extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ObjectPageHeaderPictureShape & String] = js.native
    
    /**
      * Circle shape for the images in the `ObjectPageHeader`.
      */
    @js.native
    sealed trait Circle
      extends StObject
         with ObjectPageHeaderPictureShape
    /* "Circle" */ val Circle: typings.openui5.sapUxapLibraryMod.ObjectPageHeaderPictureShape.Circle & String = js.native
    
    /**
      * Square shape for the images in the `ObjectPageHeader`.
      */
    @js.native
    sealed trait Square
      extends StObject
         with ObjectPageHeaderPictureShape
    /* "Square" */ val Square: typings.openui5.sapUxapLibraryMod.ObjectPageHeaderPictureShape.Square & String = js.native
  }
  
  @js.native
  sealed trait ObjectPageSubSectionLayout extends StObject
  @JSImport("sap/uxap/library", "ObjectPageSubSectionLayout")
  @js.native
  object ObjectPageSubSectionLayout extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ObjectPageSubSectionLayout & String] = js.native
    
    /**
      * Title and actions on the left, inside the block area.
      */
    @js.native
    sealed trait TitleOnLeft
      extends StObject
         with ObjectPageSubSectionLayout
    /* "TitleOnLeft" */ val TitleOnLeft: typings.openui5.sapUxapLibraryMod.ObjectPageSubSectionLayout.TitleOnLeft & String = js.native
    
    /**
      * Title and actions on top of the block area.
      */
    @js.native
    sealed trait TitleOnTop
      extends StObject
         with ObjectPageSubSectionLayout
    /* "TitleOnTop" */ val TitleOnTop: typings.openui5.sapUxapLibraryMod.ObjectPageSubSectionLayout.TitleOnTop & String = js.native
  }
  
  @js.native
  sealed trait ObjectPageSubSectionMode extends StObject
  @JSImport("sap/uxap/library", "ObjectPageSubSectionMode")
  @js.native
  object ObjectPageSubSectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ObjectPageSubSectionMode & String] = js.native
    
    /**
      * Collapsed mode of display of the `ObjectPageLayout`.
      */
    @js.native
    sealed trait Collapsed
      extends StObject
         with ObjectPageSubSectionMode
    /* "Collapsed" */ val Collapsed: typings.openui5.sapUxapLibraryMod.ObjectPageSubSectionMode.Collapsed & String = js.native
    
    /**
      * Expanded mode of displaying the `ObjectPageLayout`.
      */
    @js.native
    sealed trait Expanded
      extends StObject
         with ObjectPageSubSectionMode
    /* "Expanded" */ val Expanded: typings.openui5.sapUxapLibraryMod.ObjectPageSubSectionMode.Expanded & String = js.native
  }
  
  type BlockBaseColumnLayout = String
  
  trait IHeaderContent extends StObject {
    
    var __implements__sap_uxap_IHeaderContent: Boolean
  }
  object IHeaderContent {
    
    inline def apply(__implements__sap_uxap_IHeaderContent: Boolean): IHeaderContent = {
      val __obj = js.Dynamic.literal(__implements__sap_uxap_IHeaderContent = __implements__sap_uxap_IHeaderContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHeaderContent]
    }
    
    extension [Self <: IHeaderContent](x: Self) {
      
      inline def set__implements__sap_uxap_IHeaderContent(value: Boolean): Self = StObject.set(x, "__implements__sap_uxap_IHeaderContent", value.asInstanceOf[js.Any])
    }
  }
  
  trait IHeaderTitle extends StObject {
    
    var __implements__sap_uxap_IHeaderTitle: Boolean
  }
  object IHeaderTitle {
    
    inline def apply(__implements__sap_uxap_IHeaderTitle: Boolean): IHeaderTitle = {
      val __obj = js.Dynamic.literal(__implements__sap_uxap_IHeaderTitle = __implements__sap_uxap_IHeaderTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHeaderTitle]
    }
    
    extension [Self <: IHeaderTitle](x: Self) {
      
      inline def set__implements__sap_uxap_IHeaderTitle(value: Boolean): Self = StObject.set(x, "__implements__sap_uxap_IHeaderTitle", value.asInstanceOf[js.Any])
    }
  }
}
