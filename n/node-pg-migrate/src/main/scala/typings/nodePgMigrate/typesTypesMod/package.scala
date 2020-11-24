package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesTypesMod {
  
  type AddTypeAttribute = typings.nodePgMigrate.typesTypesMod.AddTypeAttributeFn with typings.nodePgMigrate.anon.ReverseAddTypeAttributeFn
  
  type AddTypeAttributeFn = js.Function3[
    /* typeName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* attributeName */ java.lang.String, 
    /* attributeType */ typings.nodePgMigrate.generalTypesMod.Type with typings.nodePgMigrate.generalTypesMod.IfExistsOption, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type AddTypeValue = js.Function3[
    /* typeName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* value */ typings.nodePgMigrate.generalTypesMod.Value, 
    /* options */ js.UndefOr[typings.nodePgMigrate.typesTypesMod.AddTypeValueOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateType = typings.nodePgMigrate.typesTypesMod.CreateTypeFn with typings.nodePgMigrate.anon.ReverseCreateTypeFn
  
  type CreateTypeFn = js.Function2[
    /* typeName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* values */ (js.Array[typings.nodePgMigrate.generalTypesMod.Value] | org.scalablytyped.runtime.StringDictionary[typings.nodePgMigrate.generalTypesMod.Type]) with typings.nodePgMigrate.generalTypesMod.DropOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropType = js.Function2[
    /* typeName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropTypeAttribute = js.Function3[
    /* typeName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* attributeName */ java.lang.String, 
    /* options */ typings.nodePgMigrate.generalTypesMod.IfExistsOption, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameType = typings.nodePgMigrate.typesTypesMod.RenameTypeFn with typings.nodePgMigrate.anon.ReverseRenameTypeFn
  
  type RenameTypeAttribute = typings.nodePgMigrate.typesTypesMod.RenameTypeAttributeFn with typings.nodePgMigrate.anon.ReverseRenameTypeAttributeFn
  
  type RenameTypeAttributeFn = js.Function3[
    /* typeName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* attributeName */ java.lang.String, 
    /* newAttributeName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameTypeFn = js.Function2[
    /* typeName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* newTypeName */ typings.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameTypeValue = typings.nodePgMigrate.typesTypesMod.RenameTypeValueFn with typings.nodePgMigrate.anon.ReverseRenameTypeValueFn
  
  type RenameTypeValueFn = js.Function3[
    /* typeName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* value */ java.lang.String, 
    /* newValue */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type SetTypeAttribute = js.Function3[
    /* typeName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* attributeName */ java.lang.String, 
    /* attributeType */ typings.nodePgMigrate.generalTypesMod.Type, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
