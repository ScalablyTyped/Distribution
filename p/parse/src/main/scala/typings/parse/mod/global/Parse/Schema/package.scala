package typings.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Schema {
  
  type AttrType[T /* <: typings.parse.mod.global.Parse.Object[typings.parse.mod.global.Parse.Attributes] */, V] = typings.std.Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T['attributes'] ]: T['attributes'][K] extends V? K : never}[keyof T['attributes']] */ js.Any, 
    java.lang.String
  ]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.std.Date
    - typings.parse.mod.global.Parse.File
    - typings.parse.mod.global.Parse.GeoPoint
    - typings.parse.mod.global.Parse.Polygon
    - js.Array[js.Any]
    - js.Object
    - typings.parse.mod.global.Parse.Pointer
    - typings.parse.mod.global.Parse.Relation[
  typings.parse.mod.global.Parse.Object[typings.parse.mod.global.Parse.Attributes], 
  typings.parse.mod.global.Parse.Object[typings.parse.mod.global.Parse.Attributes]]
  */
  type FieldType = typings.parse.mod.global.Parse.Schema._FieldType | js.Array[js.Any] | (typings.parse.mod.global.Parse.Relation[
    typings.parse.mod.global.Parse.Object[typings.parse.mod.global.Parse.Attributes], 
    typings.parse.mod.global.Parse.Object[typings.parse.mod.global.Parse.Attributes]
  ]) | java.lang.String | scala.Double | scala.Boolean | typings.std.Date | js.Object
  
  type Index = org.scalablytyped.runtime.StringDictionary[typings.parse.mod.global.Parse.Schema.TYPE]
}
