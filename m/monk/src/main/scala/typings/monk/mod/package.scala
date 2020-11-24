package typings.monk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[/* err */ typings.std.Error | scala.Null, /* data */ T, scala.Unit]
  
  type CreateIndexInput[T] = java.lang.String | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? 1 | -1}
    */ typings.monk.monkStrings.CreateIndexInput with org.scalablytyped.runtime.TopLevel[js.Any])
  
  type DropIndexInput[T] = typings.monk.mod.CreateIndexInput[T] with js.Array[java.lang.String]
  
  type FindOneResult[T] = typings.monk.mod.WithID[T] | scala.Null
  
  type FindRawResult[T] = typings.mongodb.mod.Cursor[typings.monk.mod.WithID[T]]
  
  type GeoHaystackSearchResult[T] = js.Array[T]
  
  type IndexesResult[T] = org.scalablytyped.runtime.StringDictionary[
    js.Array[
      js.Tuple2[
        /* keyof T */ java.lang.String, 
        typings.monk.monkNumbers.`1` | typings.monk.monkNumbers.`-1`
      ]
    ]
  ]
  
  type InsertResult[T] = typings.monk.mod.WithID[T]
  
  type RemoveOptions = typings.mongodb.mod.CommonOptions with typings.monk.mod.SingleMulti
  
  // Utils
  type SingleOrArray[T] = T | js.Array[T]
  
  type TFields = java.lang.String | js.Array[java.lang.String]
  
  type TMiddleware = js.Function1[
    /* hasCollectionMonkInstance */ typings.monk.anon.Collection, 
    js.Function1[
      /* next */ js.Function2[/* args */ js.Object, /* method */ java.lang.String, js.Promise[js.Any]], 
      js.Function2[/* args */ js.Object, /* method */ java.lang.String, js.Promise[js.Any]]
    ]
  ]
  
  type TQuery = java.lang.String | js.Object
  
  type WithID[T] = typings.monk.anon.Id with T
}
