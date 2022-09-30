package typings.mongodb.mod

import org.scalablytyped.runtime.Instantiable0
import typings.mongodb.anon.TypeofObjectId
import typings.mongodb.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("mongodb", "ObjectID")
@js.native
/* Excluded from this release type: [kId] */
/* Excluded from this release type: __id */
/**
  * Create an ObjectId type
  *
  * @param inputId - Can be a 24 character hex string, 12 byte binary Buffer, or a number.
  */
open class ObjectID_ ()
  extends typings.bson.mod.ObjectId
object ObjectID_ {
  
  inline def apply: Instantiable0[typings.bson.mod.ObjectId] & TypeofObjectId = ^.asInstanceOf[js.Dynamic].selectDynamic("ObjectID").asInstanceOf[Instantiable0[typings.bson.mod.ObjectId] & TypeofObjectId]
}
