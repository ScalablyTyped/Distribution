package typings.openui5.global.sap.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  /**
    * Available Background Design.
    */
  @JSGlobal("sap.ui.layout.BackgroundDesign")
  @js.native
  object BackgroundDesign extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.layout.BackgroundDesign & Double] = js.native
    
    /* 0 */ val Solid: typings.openui5.sap.ui.layout.BackgroundDesign.Solid & Double = js.native
    
    /* 1 */ val Translucent: typings.openui5.sap.ui.layout.BackgroundDesign.Translucent & Double = js.native
    
    /* 2 */ val Transparent: typings.openui5.sap.ui.layout.BackgroundDesign.Transparent & Double = js.native
  }
  
  object BlockBackgroundType {
    
    @JSGlobal("sap.ui.layout.BlockBackgroundType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Background is transparent
      */
    @JSGlobal("sap.ui.layout.BlockBackgroundType.Default")
    @js.native
    def Default: js.Any = js.native
    @scala.inline
    def Default_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    /**
      * Background is with predefined light colors
      */
    @JSGlobal("sap.ui.layout.BlockBackgroundType.Light")
    @js.native
    def Light: js.Any = js.native
    @scala.inline
    def Light_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Light")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("sap.ui.layout.BlockLayout")
  @js.native
  class BlockLayout protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.BlockLayout {
    /**
      * Constructor for a new BlockLayout.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.BlockLayoutCell")
  @js.native
  class BlockLayoutCell protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.BlockLayoutCell {
    /**
      * Constructor for a new BlockLayoutCell.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.BlockLayoutRow")
  @js.native
  class BlockLayoutRow protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.BlockLayoutRow {
    /**
      * Constructor for a new BlockLayoutRow.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.DynamicSideContent")
  @js.native
  class DynamicSideContent protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.DynamicSideContent {
    /**
      * Constructor for a new DynamicSideContent.Accepts an object literal <code>mSettings</code> that
      * defines initialproperty values, aggregated and associated objects as well as event handlers.See
      * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
      * settings object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.FixFlex")
  @js.native
  class FixFlex protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.FixFlex {
    /**
      * Constructor for a new FixFlex.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.Grid")
  @js.native
  class Grid protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.Grid {
    /**
      * Constructor for a new Grid.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.GridData")
  @js.native
  class GridData protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.GridData {
    /**
      * Constructor for a new GridData.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  /**
    * The position of the Grid. Can be "Left", "Center" or "Right". "Left" is default.
    */
  @JSGlobal("sap.ui.layout.GridPosition")
  @js.native
  object GridPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.layout.GridPosition & Double] = js.native
    
    /* 0 */ val Center: typings.openui5.sap.ui.layout.GridPosition.Center & Double = js.native
    
    /* 1 */ val Left: typings.openui5.sap.ui.layout.GridPosition.Left & Double = js.native
    
    /* 2 */ val Right: typings.openui5.sap.ui.layout.GridPosition.Right & Double = js.native
  }
  
  @JSGlobal("sap.ui.layout.HorizontalLayout")
  @js.native
  class HorizontalLayout protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.HorizontalLayout {
    /**
      * Constructor for a new HorizontalLayout.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.PaneContainer")
  @js.native
  class PaneContainer protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.PaneContainer {
    /**
      * Constructor for a new PaneContainer.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.ResponsiveFlowLayout")
  @js.native
  class ResponsiveFlowLayout protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.ResponsiveFlowLayout {
    /**
      * Constructor for a new ResponsiveFlowLayout.Accepts an object literal <code>mSettings</code> that
      * defines initialproperty values, aggregated and associated objects as well as event handlers.See
      * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
      * settings object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.ResponsiveFlowLayoutData")
  @js.native
  class ResponsiveFlowLayoutData protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.ResponsiveFlowLayoutData {
    /**
      * Constructor for a new ResponsiveFlowLayoutData.Accepts an object literal <code>mSettings</code> that
      * defines initialproperty values, aggregated and associated objects as well as event handlers.See
      * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
      * settings object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.ResponsiveSplitter")
  @js.native
  class ResponsiveSplitter protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.ResponsiveSplitter {
    /**
      * Constructor for a new ResponsiveSplitter.Accepts an object literal <code>mSettings</code> that
      * defines initialproperty values, aggregated and associated objects as well as event handlers.See
      * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
      * settings object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  /**
    * Types of the DynamicSideContent FallDown options
    */
  @JSGlobal("sap.ui.layout.SideContentFallDown")
  @js.native
  object SideContentFallDown extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.layout.SideContentFallDown & Double] = js.native
    
    /* 0 */ val BelowL: typings.openui5.sap.ui.layout.SideContentFallDown.BelowL & Double = js.native
    
    /* 1 */ val BelowM: typings.openui5.sap.ui.layout.SideContentFallDown.BelowM & Double = js.native
    
    /* 2 */ val BelowXL: typings.openui5.sap.ui.layout.SideContentFallDown.BelowXL & Double = js.native
    
    /* 3 */ val OnMinimumWidth: typings.openui5.sap.ui.layout.SideContentFallDown.OnMinimumWidth & Double = js.native
  }
  
  /**
    * The position of the side content - End (default) and Begin.
    */
  @JSGlobal("sap.ui.layout.SideContentPosition")
  @js.native
  object SideContentPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.layout.SideContentPosition & Double] = js.native
    
    /* 0 */ val Begin: typings.openui5.sap.ui.layout.SideContentPosition.Begin & Double = js.native
    
    /* 1 */ val End: typings.openui5.sap.ui.layout.SideContentPosition.End & Double = js.native
  }
  
  /**
    * Types of the DynamicSideContent Visibility options
    */
  @JSGlobal("sap.ui.layout.SideContentVisibility")
  @js.native
  object SideContentVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.layout.SideContentVisibility & Double] = js.native
    
    /* 0 */ val AlwaysShow: typings.openui5.sap.ui.layout.SideContentVisibility.AlwaysShow & Double = js.native
    
    /* 1 */ val NeverShow: typings.openui5.sap.ui.layout.SideContentVisibility.NeverShow & Double = js.native
    
    /* 2 */ val ShowAboveL: typings.openui5.sap.ui.layout.SideContentVisibility.ShowAboveL & Double = js.native
    
    /* 3 */ val ShowAboveM: typings.openui5.sap.ui.layout.SideContentVisibility.ShowAboveM & Double = js.native
    
    /* 4 */ val ShowAboveS: typings.openui5.sap.ui.layout.SideContentVisibility.ShowAboveS & Double = js.native
  }
  
  @JSGlobal("sap.ui.layout.SplitPane")
  @js.native
  class SplitPane protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.SplitPane {
    /**
      * Constructor for a new SplitPane.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.Splitter")
  @js.native
  class Splitter protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.Splitter {
    /**
      * Constructor for a new Splitter.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.SplitterLayoutData")
  @js.native
  class SplitterLayoutData protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.SplitterLayoutData {
    /**
      * Constructor for a new SplitterLayoutData.Accepts an object literal <code>mSettings</code> that
      * defines initialproperty values, aggregated and associated objects as well as event handlers.See
      * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
      * settings object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.layout.VerticalLayout")
  @js.native
  class VerticalLayout protected ()
    extends StObject
       with typings.openui5.sap.ui.layout.VerticalLayout {
    /**
      * Constructor for a new VerticalLayout.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId Id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  object form {
    
    @JSGlobal("sap.ui.layout.form.Form")
    @js.native
    class Form protected ()
      extends StObject
         with typings.openui5.sap.ui.layout.form.Form {
      /**
        * Constructor for a new sap.ui.layout.form.Form.Accepts an object literal <code>mSettings</code> that
        * defines initialproperty values, aggregated and associated objects as well as event handlers.See
        * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
        * settings object.
        * @param sId id for the new control, generated automatically if no id is given
        * @param mSettings initial settings for the new control
        */
      def this(sId: String) = this()
      def this(sId: String, mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.layout.form.FormContainer")
    @js.native
    class FormContainer protected ()
      extends StObject
         with typings.openui5.sap.ui.layout.form.FormContainer {
      /**
        * Constructor for a new sap.ui.layout.form.FormContainer.Accepts an object literal
        * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
        * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
        * of the syntax of the settings object.
        * @param sId Id for the new control, generated automatically if no id is given
        * @param mSettings initial settings for the new control
        */
      def this(sId: String) = this()
      def this(sId: String, mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.layout.form.FormElement")
    @js.native
    class FormElement protected ()
      extends StObject
         with typings.openui5.sap.ui.layout.form.FormElement {
      /**
        * Constructor for a new sap.ui.layout.form.FormElement.Accepts an object literal
        * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
        * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
        * of the syntax of the settings object.
        * @param sId Id for the new control, generated automatically if no id is given
        * @param mSettings initial settings for the new control
        */
      def this(sId: String) = this()
      def this(sId: String, mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.layout.form.FormLayout")
    @js.native
    class FormLayout protected ()
      extends StObject
         with typings.openui5.sap.ui.layout.form.FormLayout {
      /**
        * Constructor for a new sap.ui.layout.form.FormLayout.Accepts an object literal <code>mSettings</code>
        * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
        * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
        * settings object.
        * @param sId Id for the new control, generated automatically if no id is given
        * @param mSettings initial settings for the new control
        */
      def this(sId: String) = this()
      def this(sId: String, mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.layout.form.GridContainerData")
    @js.native
    class GridContainerData protected ()
      extends StObject
         with typings.openui5.sap.ui.layout.form.GridContainerData {
      /**
        * Constructor for a new sap.ui.layout.form.GridContainerData.Accepts an object literal
        * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
        * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
        * of the syntax of the settings object.
        * @param sId Id for the new control, generated automatically if no id is given
        * @param mSettings initial settings for the new control
        */
      def this(sId: String) = this()
      def this(sId: String, mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.layout.form.GridElementData")
    @js.native
    class GridElementData protected ()
      extends StObject
         with typings.openui5.sap.ui.layout.form.GridElementData {
      /**
        * Constructor for a new sap.ui.layout.form.GridElementData.Accepts an object literal
        * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
        * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
        * of the syntax of the settings object.
        * @param sId Id for the new control, generated automatically if no id is given
        * @param mSettings initial settings for the new control
        */
      def this(sId: String) = this()
      def this(sId: String, mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.layout.form.GridLayout")
    @js.native
    class GridLayout protected ()
      extends StObject
         with typings.openui5.sap.ui.layout.form.GridLayout {
      /**
        * Constructor for a new sap.ui.layout.form.GridLayout.Accepts an object literal <code>mSettings</code>
        * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
        * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
        * settings object.
        * @param sId Id for the new control, generated automatically if no id is given
        * @param mSettings initial settings for the new control
        */
      def this(sId: String) = this()
      def this(sId: String, mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.layout.form.ResponsiveGridLayout")
    @js.native
    class ResponsiveGridLayout protected ()
      extends StObject
         with typings.openui5.sap.ui.layout.form.ResponsiveGridLayout {
      /**
        * Constructor for a new <code>sap.ui.layout.form.ResponsiveGridLayout</code>.Accepts an object literal
        * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
        * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
        * of the syntax of the settings object.
        * @param sId ID for the new control, generated automatically if no ID is given
        * @param mSettings Initial settings for the new control
        */
      def this(sId: String) = this()
      def this(sId: String, mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.layout.form.ResponsiveLayout")
    @js.native
    class ResponsiveLayout protected ()
      extends StObject
         with typings.openui5.sap.ui.layout.form.ResponsiveLayout {
      /**
        * Constructor for a new sap.ui.layout.form.ResponsiveLayout.
        * @param sId Id for the new control, generated automatically if no id is given
        * @param mSettings initial settings for the new control
        */
      def this(sId: String) = this()
      def this(sId: String, mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.layout.form.SimpleForm")
    @js.native
    class SimpleForm protected ()
      extends StObject
         with typings.openui5.sap.ui.layout.form.SimpleForm {
      /**
        * Constructor for a new sap.ui.layout.form.SimpleForm.Accepts an object literal <code>mSettings</code>
        * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
        * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
        * settings object.
        * @param sId ID for the new control, generated automatically if no ID is given
        * @param mSettings Initial settings for the new control
        */
      def this(sId: String) = this()
      def this(sId: String, mSettings: js.Any) = this()
    }
    
    /**
      * Available <code>FormLayouts</code> used to render a <code>SimpleForm</code>.
      */
    @JSGlobal("sap.ui.layout.form.SimpleFormLayout")
    @js.native
    object SimpleFormLayout extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.layout.form.SimpleFormLayout & Double] = js.native
      
      /* 0 */ val GridLayout: typings.openui5.sap.ui.layout.form.SimpleFormLayout.GridLayout & Double = js.native
      
      /* 1 */ val ResponsiveGridLayout: typings.openui5.sap.ui.layout.form.SimpleFormLayout.ResponsiveGridLayout & Double = js.native
      
      /* 2 */ val ResponsiveLayout: typings.openui5.sap.ui.layout.form.SimpleFormLayout.ResponsiveLayout & Double = js.native
    }
  }
}
