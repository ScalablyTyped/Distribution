package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tablesTypesMod {
  type AddColumns = typings.nodePgMigrate.tablesTypesMod.AddColumnsFn with typings.nodePgMigrate.AnonReverseAddColumnsFn
  type AddColumnsFn = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* newColumns */ typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions, 
    /* addOptions */ js.UndefOr[
      typings.nodePgMigrate.generalTypesMod.IfNotExistsOption with typings.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type AlterColumn = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* columnName */ java.lang.String, 
    /* options */ typings.nodePgMigrate.tablesTypesMod.AlterColumnOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type AlterTable = js.Function2[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* alterOptions */ typings.nodePgMigrate.tablesTypesMod.AlterTableOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type ColumnDefinitions = org.scalablytyped.runtime.StringDictionary[typings.nodePgMigrate.tablesTypesMod.ColumnDefinition | java.lang.String]
  type CreateConstraint = typings.nodePgMigrate.tablesTypesMod.CreateConstraintFn with typings.nodePgMigrate.AnonReverseCreateConstraintFn
  type CreateConstraintFn = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* constraintName */ java.lang.String | scala.Null, 
    /* expression */ (java.lang.String | typings.nodePgMigrate.tablesTypesMod.ConstraintOptions) with typings.nodePgMigrate.generalTypesMod.DropOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreateTable = typings.nodePgMigrate.tablesTypesMod.CreateTableFn with typings.nodePgMigrate.AnonReverseCreateTableFn
  type CreateTableFn = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions, 
    /* options */ js.UndefOr[
      typings.nodePgMigrate.tablesTypesMod.TableOptions with typings.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropColumns = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropConstraint = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* constraintName */ java.lang.String, 
    /* options */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropTable = js.Function2[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type RenameColumn = typings.nodePgMigrate.tablesTypesMod.RenameColumnFn with typings.nodePgMigrate.AnonReverseRenameColumnFn
  type RenameColumnFn = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* oldColumnName */ java.lang.String, 
    /* newColumnName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type RenameConstraint = typings.nodePgMigrate.tablesTypesMod.RenameConstraintFn with typings.nodePgMigrate.AnonReverseRenameConstraintFn
  type RenameConstraintFn = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* oldConstraintName */ java.lang.String, 
    /* newConstraintName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type RenameTable = typings.nodePgMigrate.tablesTypesMod.RenameTableFn with typings.nodePgMigrate.AnonReverseRenameTableFn
  type RenameTableFn = js.Function2[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* newtableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
