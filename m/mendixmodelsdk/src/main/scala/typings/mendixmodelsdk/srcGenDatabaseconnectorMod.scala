package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenConstantsMod.constants.IConstant
import typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ActionActivity
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowAction
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenDatabaseconnectorMod {
  
  @JSImport("mendixmodelsdk/src/gen/databaseconnector", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
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
    @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.ColumnMapping")
    @js.native
    open class ColumnMapping protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def attribute: IAttribute = js.native
      
      def attributeQualifiedName: String = js.native
      
      def attribute_=(newValue: IAttribute): Unit = js.native
      
      def columnName: String = js.native
      def columnName_=(newValue: String): Unit = js.native
      
      def containerAsTableMapping: TableMapping = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def sqlDataType: SqlDataType | Null = js.native
      def sqlDataType_=(newValue: SqlDataType | Null): Unit = js.native
    }
    object ColumnMapping {
      
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.ColumnMapping")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ColumnMapping instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ColumnMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ColumnMapping]
      
      /**
        * Creates and returns a new ColumnMapping instance in the SDK and on the server.
        * The new ColumnMapping will be automatically stored in the 'columns' property
        * of the parent TableMapping element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.22.0 and higher
        */
      /* static member */
      inline def createIn(container: TableMapping): ColumnMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ColumnMapping]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.ColumnMapping.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.ColumnMapping.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.22.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.ConnectionDetails")
    @js.native
    open class ConnectionDetails protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsDatabaseConnection: DatabaseConnection = js.native
      
      def databaseName: String = js.native
      def databaseName_=(newValue: String): Unit = js.native
      
      def host: String = js.native
      def host_=(newValue: String): Unit = js.native
      
      def port: Double = js.native
      def port_=(newValue: Double): Unit = js.native
    }
    object ConnectionDetails {
      
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.ConnectionDetails")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ConnectionDetails instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ConnectionDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ConnectionDetails]
      
      /**
        * Creates and returns a new ConnectionDetails instance in the SDK and on the server.
        * The new ConnectionDetails will be automatically stored in the 'connectionDetails' property
        * of the parent DatabaseConnection element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.22.0 and higher
        */
      /* static member */
      inline def createIn(container: DatabaseConnection): ConnectionDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ConnectionDetails]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.ConnectionDetails.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.ConnectionDetails.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.22.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.IDatabaseConnection because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined queries */ @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.DatabaseConnection")
    @js.native
    open class DatabaseConnection protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def connectionDetails: ConnectionDetails | Null = js.native
      def connectionDetails_=(newValue: ConnectionDetails | Null): Unit = js.native
      
      def connectionString: IConstant | Null = js.native
      
      def connectionStringQualifiedName: String | Null = js.native
      
      def connectionString_=(newValue: IConstant | Null): Unit = js.native
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MDatabaseConnection: FolderBase = js.native
      
      def databaseType: String = js.native
      def databaseType_=(newValue: String): Unit = js.native
      
      def password: IConstant | Null = js.native
      
      def passwordQualifiedName: String | Null = js.native
      
      def password_=(newValue: IConstant | Null): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def queries: IList[DatabaseQuery] = js.native
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      @JSName("queries")
      val queries_FDatabaseConnection: IList[IDatabaseQuery] = js.native
      
      def userName: IConstant | Null = js.native
      
      def userNameQualifiedName: String | Null = js.native
      
      def userName_=(newValue: IConstant | Null): Unit = js.native
    }
    object DatabaseConnection {
      
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.DatabaseConnection")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new DatabaseConnection unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): DatabaseConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DatabaseConnection]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.DatabaseConnection.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.DatabaseConnection.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.22.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.IDatabaseQuery because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDatabaseConnection, name */ @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.DatabaseQuery")
    @js.native
    open class DatabaseQuery protected ()
      extends Element[IModel]
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsDatabaseConnection: DatabaseConnection = js.native
      @JSName("containerAsDatabaseConnection")
      val containerAsDatabaseConnection_FDatabaseQuery: IDatabaseConnection = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FDatabaseQuery: String = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def parameters: IList[QueryParameter] = js.native
      
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
      @JSName("qualifiedName")
      def qualifiedName_MDatabaseQuery: String | Null = js.native
      
      def query: String = js.native
      def query_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def tableMapping: TableMapping = js.native
      def tableMapping_=(newValue: TableMapping): Unit = js.native
    }
    object DatabaseQuery {
      
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.DatabaseQuery")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new DatabaseQuery instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): DatabaseQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DatabaseQuery]
      
      /**
        * Creates and returns a new DatabaseQuery instance in the SDK and on the server.
        * The new DatabaseQuery will be automatically stored in the 'queries' property
        * of the parent DatabaseConnection element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.22.0 and higher
        */
      /* static member */
      inline def createIn(container: DatabaseConnection): DatabaseQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DatabaseQuery]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.DatabaseQuery.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.DatabaseQuery.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.ExecuteDatabaseQueryAction")
    @js.native
    open class ExecuteDatabaseQueryAction protected () extends MicroflowAction {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def outputVariableName: String = js.native
      def outputVariableName_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def parameterMappings: IList[QueryParameterMapping] = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def query: IDatabaseQuery = js.native
      
      def queryQualifiedName: String = js.native
      
      def query_=(newValue: IDatabaseQuery): Unit = js.native
    }
    object ExecuteDatabaseQueryAction {
      
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.ExecuteDatabaseQueryAction")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ExecuteDatabaseQueryAction instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ExecuteDatabaseQueryAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ExecuteDatabaseQueryAction]
      
      /**
        * Creates and returns a new ExecuteDatabaseQueryAction instance in the SDK and on the server.
        * The new ExecuteDatabaseQueryAction will be automatically stored in the 'action' property
        * of the parent microflows.ActionActivity element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createIn(container: ActionActivity): ExecuteDatabaseQueryAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ExecuteDatabaseQueryAction]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.ExecuteDatabaseQueryAction.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.ExecuteDatabaseQueryAction.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.22.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.LimitedLengthSqlDataType")
    @js.native
    open class LimitedLengthSqlDataType protected () extends SqlDataType {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def length: Double = js.native
      def length_=(newValue: Double): Unit = js.native
    }
    object LimitedLengthSqlDataType {
      
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.LimitedLengthSqlDataType")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new LimitedLengthSqlDataType instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): LimitedLengthSqlDataType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[LimitedLengthSqlDataType]
      
      /**
        * Creates and returns a new LimitedLengthSqlDataType instance in the SDK and on the server.
        * The new LimitedLengthSqlDataType will be automatically stored in the 'sqlDataType' property
        * of the parent ColumnMapping element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.22.0 and higher
        */
      /* static member */
      inline def createInColumnMappingUnderSqlDataType(container: ColumnMapping): LimitedLengthSqlDataType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInColumnMappingUnderSqlDataType")(container.asInstanceOf[js.Any]).asInstanceOf[LimitedLengthSqlDataType]
      
      /**
        * Creates and returns a new LimitedLengthSqlDataType instance in the SDK and on the server.
        * The new LimitedLengthSqlDataType will be automatically stored in the 'sqlDataType' property
        * of the parent QueryParameter element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.22.0 and higher
        */
      /* static member */
      inline def createInQueryParameterUnderSqlDataType(container: QueryParameter): LimitedLengthSqlDataType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderSqlDataType")(container.asInstanceOf[js.Any]).asInstanceOf[LimitedLengthSqlDataType]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.LimitedLengthSqlDataType.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.LimitedLengthSqlDataType.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.22.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.QueryParameter")
    @js.native
    open class QueryParameter protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsDatabaseQuery: DatabaseQuery = js.native
      
      def dataType: DataType | Null = js.native
      def dataType_=(newValue: DataType | Null): Unit = js.native
      
      def defaultValue: String = js.native
      def defaultValue_=(newValue: String): Unit = js.native
      
      def parameterName: String = js.native
      def parameterName_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def sqlDataType: SqlDataType | Null = js.native
      def sqlDataType_=(newValue: SqlDataType | Null): Unit = js.native
    }
    object QueryParameter {
      
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.QueryParameter")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new QueryParameter instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): QueryParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[QueryParameter]
      
      /**
        * Creates and returns a new QueryParameter instance in the SDK and on the server.
        * The new QueryParameter will be automatically stored in the 'parameters' property
        * of the parent DatabaseQuery element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.22.0 and higher
        */
      /* static member */
      inline def createIn(container: DatabaseQuery): QueryParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[QueryParameter]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.QueryParameter.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.QueryParameter.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.QueryParameterMapping")
    @js.native
    open class QueryParameterMapping protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsExecuteDatabaseQueryAction: ExecuteDatabaseQueryAction = js.native
      
      def parameterName: String = js.native
      def parameterName_=(newValue: String): Unit = js.native
      
      /**
        * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
        */
      def value: String = js.native
      def value_=(newValue: String): Unit = js.native
    }
    object QueryParameterMapping {
      
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.QueryParameterMapping")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new QueryParameterMapping instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): QueryParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[QueryParameterMapping]
      
      /**
        * Creates and returns a new QueryParameterMapping instance in the SDK and on the server.
        * The new QueryParameterMapping will be automatically stored in the 'parameterMappings' property
        * of the parent ExecuteDatabaseQueryAction element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createIn(container: ExecuteDatabaseQueryAction): QueryParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[QueryParameterMapping]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.QueryParameterMapping.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.QueryParameterMapping.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.22.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.SimpleSqlDataType")
    @js.native
    open class SimpleSqlDataType protected () extends SqlDataType {
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
      
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.SimpleSqlDataType")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new SimpleSqlDataType instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): SimpleSqlDataType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[SimpleSqlDataType]
      
      /**
        * Creates and returns a new SimpleSqlDataType instance in the SDK and on the server.
        * The new SimpleSqlDataType will be automatically stored in the 'sqlDataType' property
        * of the parent ColumnMapping element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.22.0 and higher
        */
      /* static member */
      inline def createInColumnMappingUnderSqlDataType(container: ColumnMapping): SimpleSqlDataType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInColumnMappingUnderSqlDataType")(container.asInstanceOf[js.Any]).asInstanceOf[SimpleSqlDataType]
      
      /**
        * Creates and returns a new SimpleSqlDataType instance in the SDK and on the server.
        * The new SimpleSqlDataType will be automatically stored in the 'sqlDataType' property
        * of the parent QueryParameter element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.22.0 and higher
        */
      /* static member */
      inline def createInQueryParameterUnderSqlDataType(container: QueryParameter): SimpleSqlDataType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderSqlDataType")(container.asInstanceOf[js.Any]).asInstanceOf[SimpleSqlDataType]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.SimpleSqlDataType.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.SimpleSqlDataType.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.22.0: introduced
      */
    /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.SqlDataType")
    @js.native
    open class SqlDataType protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsColumnMapping: ColumnMapping = js.native
      
      def containerAsQueryParameter: QueryParameter = js.native
      
      def dataTypeName: String = js.native
      def dataTypeName_=(newValue: String): Unit = js.native
    }
    object SqlDataType {
      
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.SqlDataType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.SqlDataType.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.SqlDataType.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.22.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.TableMapping")
    @js.native
    open class TableMapping protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def columns: IList[ColumnMapping] = js.native
      
      def containerAsDatabaseQuery: DatabaseQuery = js.native
      
      def entity: IEntity = js.native
      
      def entityQualifiedName: String = js.native
      
      def entity_=(newValue: IEntity): Unit = js.native
      
      def tableName: String = js.native
      def tableName_=(newValue: String): Unit = js.native
    }
    object TableMapping {
      
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.TableMapping")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new TableMapping instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): TableMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[TableMapping]
      
      /**
        * Creates and returns a new TableMapping instance in the SDK and on the server.
        * The new TableMapping will be automatically stored in the 'tableMapping' property
        * of the parent DatabaseQuery element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.22.0 and higher
        */
      /* static member */
      inline def createIn(container: DatabaseQuery): TableMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[TableMapping]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.TableMapping.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/databaseconnector", "databaseconnector.TableMapping.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.22.0: introduced
      */
    @js.native
    trait IDatabaseConnection
      extends StObject
         with IDocument {
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      val queries: IList[IDatabaseQuery] = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.22.0: introduced
      */
    @js.native
    trait IDatabaseQuery
      extends StObject
         with IElement
         with IByNameReferrable {
      
      val containerAsDatabaseConnection: IDatabaseConnection = js.native
      
      @JSName("model")
      val model_IDatabaseQuery: IModel = js.native
      
      val name: String = js.native
    }
  }
}
