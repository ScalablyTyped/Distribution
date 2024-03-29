package typings.mendixmodelsdk.srcGenAllModelClassesMod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ActionActivity
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseconnector {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `DatabaseConnector`.
    */
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.22.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.ColumnMapping")
  @js.native
  open class ColumnMapping protected ()
    extends typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ColumnMapping {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ColumnMapping {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.ColumnMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ColumnMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ColumnMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ColumnMapping]
    
    /**
      * Creates and returns a new ColumnMapping instance in the SDK and on the server.
      * The new ColumnMapping will be automatically stored in the 'columns' property
      * of the parent TableMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.TableMapping): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ColumnMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ColumnMapping]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.ColumnMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.ColumnMapping.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.22.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.ConnectionDetails")
  @js.native
  open class ConnectionDetails protected ()
    extends typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ConnectionDetails {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ConnectionDetails {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.ConnectionDetails")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ConnectionDetails instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ConnectionDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ConnectionDetails]
    
    /**
      * Creates and returns a new ConnectionDetails instance in the SDK and on the server.
      * The new ConnectionDetails will be automatically stored in the 'connectionDetails' property
      * of the parent DatabaseConnection element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.DatabaseConnection): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ConnectionDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ConnectionDetails]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.ConnectionDetails.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.ConnectionDetails.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.22.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.DatabaseConnection")
  @js.native
  open class DatabaseConnection protected ()
    extends typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.DatabaseConnection {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object DatabaseConnection {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.DatabaseConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new DatabaseConnection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.DatabaseConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.DatabaseConnection]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.DatabaseConnection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.DatabaseConnection.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.22.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.DatabaseQuery")
  @js.native
  open class DatabaseQuery protected ()
    extends typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.DatabaseQuery {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DatabaseQuery {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.DatabaseQuery")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DatabaseQuery instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.DatabaseQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.DatabaseQuery]
    
    /**
      * Creates and returns a new DatabaseQuery instance in the SDK and on the server.
      * The new DatabaseQuery will be automatically stored in the 'queries' property
      * of the parent DatabaseConnection element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.DatabaseConnection): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.DatabaseQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.DatabaseQuery]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.DatabaseQuery.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.DatabaseQuery.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.ExecuteDatabaseQueryAction")
  @js.native
  open class ExecuteDatabaseQueryAction protected ()
    extends typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ExecuteDatabaseQueryAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExecuteDatabaseQueryAction {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.ExecuteDatabaseQueryAction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExecuteDatabaseQueryAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ExecuteDatabaseQueryAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ExecuteDatabaseQueryAction]
    
    /**
      * Creates and returns a new ExecuteDatabaseQueryAction instance in the SDK and on the server.
      * The new ExecuteDatabaseQueryAction will be automatically stored in the 'action' property
      * of the parent microflows.ActionActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createIn(container: ActionActivity): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ExecuteDatabaseQueryAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ExecuteDatabaseQueryAction]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.ExecuteDatabaseQueryAction.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.ExecuteDatabaseQueryAction.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.22.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.LimitedLengthSqlDataType")
  @js.native
  open class LimitedLengthSqlDataType protected ()
    extends typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.LimitedLengthSqlDataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object LimitedLengthSqlDataType {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.LimitedLengthSqlDataType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new LimitedLengthSqlDataType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.LimitedLengthSqlDataType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.LimitedLengthSqlDataType]
    
    /**
      * Creates and returns a new LimitedLengthSqlDataType instance in the SDK and on the server.
      * The new LimitedLengthSqlDataType will be automatically stored in the 'sqlDataType' property
      * of the parent ColumnMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInColumnMappingUnderSqlDataType(container: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ColumnMapping): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.LimitedLengthSqlDataType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInColumnMappingUnderSqlDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.LimitedLengthSqlDataType]
    
    /**
      * Creates and returns a new LimitedLengthSqlDataType instance in the SDK and on the server.
      * The new LimitedLengthSqlDataType will be automatically stored in the 'sqlDataType' property
      * of the parent QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderSqlDataType(container: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameter): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.LimitedLengthSqlDataType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderSqlDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.LimitedLengthSqlDataType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.LimitedLengthSqlDataType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.LimitedLengthSqlDataType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.22.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.QueryParameter")
  @js.native
  open class QueryParameter protected ()
    extends typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameter {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object QueryParameter {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.QueryParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new QueryParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameter]
    
    /**
      * Creates and returns a new QueryParameter instance in the SDK and on the server.
      * The new QueryParameter will be automatically stored in the 'parameters' property
      * of the parent DatabaseQuery element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.DatabaseQuery): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameter]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.QueryParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.QueryParameter.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.QueryParameterMapping")
  @js.native
  open class QueryParameterMapping protected ()
    extends typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameterMapping {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object QueryParameterMapping {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.QueryParameterMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new QueryParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameterMapping]
    
    /**
      * Creates and returns a new QueryParameterMapping instance in the SDK and on the server.
      * The new QueryParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent ExecuteDatabaseQueryAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createIn(
      container: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ExecuteDatabaseQueryAction
    ): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameterMapping]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.QueryParameterMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.QueryParameterMapping.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.22.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.SimpleSqlDataType")
  @js.native
  open class SimpleSqlDataType protected ()
    extends typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.SimpleSqlDataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object SimpleSqlDataType {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.SimpleSqlDataType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new SimpleSqlDataType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.SimpleSqlDataType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.SimpleSqlDataType]
    
    /**
      * Creates and returns a new SimpleSqlDataType instance in the SDK and on the server.
      * The new SimpleSqlDataType will be automatically stored in the 'sqlDataType' property
      * of the parent ColumnMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInColumnMappingUnderSqlDataType(container: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.ColumnMapping): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.SimpleSqlDataType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInColumnMappingUnderSqlDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.SimpleSqlDataType]
    
    /**
      * Creates and returns a new SimpleSqlDataType instance in the SDK and on the server.
      * The new SimpleSqlDataType will be automatically stored in the 'sqlDataType' property
      * of the parent QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderSqlDataType(container: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameter): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.SimpleSqlDataType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderSqlDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.SimpleSqlDataType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.SimpleSqlDataType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.SimpleSqlDataType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.22.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.SqlDataType")
  @js.native
  open class SqlDataType protected ()
    extends typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.SqlDataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object SqlDataType {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.SqlDataType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.SqlDataType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.SqlDataType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.22.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.TableMapping")
  @js.native
  open class TableMapping protected ()
    extends typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.TableMapping {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object TableMapping {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.TableMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new TableMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.TableMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.TableMapping]
    
    /**
      * Creates and returns a new TableMapping instance in the SDK and on the server.
      * The new TableMapping will be automatically stored in the 'tableMapping' property
      * of the parent DatabaseQuery element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.DatabaseQuery): typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.TableMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.TableMapping]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.TableMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "databaseconnector.TableMapping.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatabaseconnectorMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
