package typings.openui5.sapUiTableTableMod

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sap/ui/table/Table", JSImport.Default)
@js.native
/**
  * Constructor for a new Table.
  *
  * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
  * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
  * of the syntax of the settings object.
  * See:
  * 	{@link https://ui5.sap.com/#/topic/08197fa68e4f479cbe30f639cc1cd22c sap.ui.table}
  * 	{@link https://ui5.sap.com/#/topic/148892ff9aea4a18b912829791e38f3e Tables: Which One Should I Choose?}
  * 	{@link fiori:/grid-table/ Grid Table}
  */
open class default () extends Table {
  def this(/**
    * initial settings for the new control
    */
  mSettings: TableSettings) = this()
  def this(/**
    * id for the new control, generated automatically if no id is given
    */
  sId: String) = this()
  def this(
    /**
    * id for the new control, generated automatically if no id is given
    */
  sId: String,
    /**
    * initial settings for the new control
    */
  mSettings: TableSettings
  ) = this()
  def this(
    /**
    * id for the new control, generated automatically if no id is given
    */
  sId: Unit,
    /**
    * initial settings for the new control
    */
  mSettings: TableSettings
  ) = this()
}
/* static members */
object default {
  
  @JSImport("sap/ui/table/Table", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new subclass of class sap.ui.table.Table with name `sClassName` and enriches it with the information
    * contained in `oClassInfo`.
    *
    * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
  oClassInfo: ClassInfo[T, Table]
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def extend[T /* <: Record[String, Any] */](
    /**
    * Name of the class being created
    */
  sClassName: String,
    /**
    * Object literal with information about the class
    */
  oClassInfo: ClassInfo[T, Table],
    /**
    * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
    * used by this class
    */
  FNMetaImpl: js.Function
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Returns a metadata object for class sap.ui.table.Table.
    *
    * @returns Metadata object describing this class
    */
  inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
}
