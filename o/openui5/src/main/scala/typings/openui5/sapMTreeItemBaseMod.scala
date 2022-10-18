package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMListItemBaseMod.ListItemBaseSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTreeItemBaseMod {
  
  @JSImport("sap/m/TreeItemBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new TreeItemBase.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.m.ListItemBase#constructor
    * sap.m.ListItemBase} can be used.
    */
  open class default () extends TreeItemBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TreeItemBaseSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: TreeItemBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TreeItemBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/TreeItemBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.TreeItemBase with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ListItemBase.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TreeItemBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TreeItemBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.TreeItemBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TreeItemBase
    extends typings.openui5.sapMListItemBaseMod.default {
    
    /**
      * @SINCE 1.42.0
      *
      * Gets the expanding information of the node.
      */
    def getExpanded(): Boolean = js.native
    
    /**
      * @SINCE 1.42.0
      *
      * Gets the context of the node.
      */
    def getItemNodeContext(): js.Object = js.native
    
    /**
      * @SINCE 1.42.0
      *
      * Gets the node level in the hierarchy.
      */
    def getLevel(): int = js.native
    
    /**
      * @SINCE 1.42.0
      *
      * Gets the parent node control.
      */
    def getParentNode(): js.UndefOr[TreeItemBase] = js.native
    
    /**
      * @SINCE 1.42.0
      *
      * Gets the context of the parent node control.
      */
    def getParentNodeContext(): js.Object = js.native
    
    /**
      * @SINCE 1.42.0
      *
      * Determines if the node is a leaf.
      */
    def isLeaf(): Boolean = js.native
    
    /**
      * @SINCE 1.42.0
      *
      * Checks if the node is the top level node.
      */
    def isTopLevel(): Boolean = js.native
  }
  
  type TreeItemBaseSettings = ListItemBaseSettings
}
