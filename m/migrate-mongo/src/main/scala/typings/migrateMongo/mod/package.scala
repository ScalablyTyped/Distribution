package typings.migrateMongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MigrationFunction = (js.Function2[
    /* db */ typings.mongodb.mod.Db, 
    (/* next */ typings.mongodb.mod.MongoCallback[typings.mongodb.mod.UpdateWriteOpResult]) | (/* client */ typings.mongodb.mod.MongoClient), 
    js.Promise[scala.Unit] | scala.Unit
  ]) | (js.Function3[
    /* db */ typings.mongodb.mod.Db, 
    /* client */ typings.mongodb.mod.MongoClient, 
    /* next */ typings.mongodb.mod.MongoCallback[typings.mongodb.mod.UpdateWriteOpResult], 
    scala.Unit
  ])
}
