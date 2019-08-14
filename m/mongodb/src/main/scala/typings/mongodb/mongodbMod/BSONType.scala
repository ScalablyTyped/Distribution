package typings.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BSONType extends js.Object

@JSImport("mongodb", "BSONType")
@js.native
object BSONType extends js.Object {
  @js.native
  sealed trait Array extends BSONType
  
  @js.native
  sealed trait BinData extends BSONType
  
  @js.native
  sealed trait Boolean extends BSONType
  
  /** @deprecated */
  @js.native
  sealed trait DBPointer extends BSONType
  
  @js.native
  sealed trait Date extends BSONType
  
  @js.native
  sealed trait Decimal extends BSONType
  
  @js.native
  sealed trait Double extends BSONType
  
  @js.native
  sealed trait Int extends BSONType
  
  @js.native
  sealed trait JavaScript extends BSONType
  
  @js.native
  sealed trait JavaScriptWithScope extends BSONType
  
  @js.native
  sealed trait Long extends BSONType
  
  @js.native
  sealed trait MaxKey extends BSONType
  
  @js.native
  sealed trait MinKey extends BSONType
  
  @js.native
  sealed trait Null extends BSONType
  
  @js.native
  sealed trait Object extends BSONType
  
  @js.native
  sealed trait ObjectId extends BSONType
  
  @js.native
  sealed trait Regex extends BSONType
  
  @js.native
  sealed trait String extends BSONType
  
  /** @deprecated */
  @js.native
  sealed trait Symbol extends BSONType
  
  @js.native
  sealed trait Timestamp extends BSONType
  
  /** @deprecated */
  @js.native
  sealed trait Undefined extends BSONType
  
  /* 2 */ val Array: typings.mongodb.mongodbMod.BSONType.Array with scala.Double = js.native
  /* 3 */ val BinData: typings.mongodb.mongodbMod.BSONType.BinData with scala.Double = js.native
  /* 6 */ val Boolean: typings.mongodb.mongodbMod.BSONType.Boolean with scala.Double = js.native
  /* 10 */ val DBPointer: typings.mongodb.mongodbMod.BSONType.DBPointer with scala.Double = js.native
  /* 7 */ val Date: typings.mongodb.mongodbMod.BSONType.Date with scala.Double = js.native
  /* 17 */ val Decimal: typings.mongodb.mongodbMod.BSONType.Decimal with scala.Double = js.native
  /* 1 */ val Double: typings.mongodb.mongodbMod.BSONType.Double with scala.Double = js.native
  /* 14 */ val Int: typings.mongodb.mongodbMod.BSONType.Int with scala.Double = js.native
  /* 11 */ val JavaScript: typings.mongodb.mongodbMod.BSONType.JavaScript with scala.Double = js.native
  /* 13 */ val JavaScriptWithScope: typings.mongodb.mongodbMod.BSONType.JavaScriptWithScope with scala.Double = js.native
  /* 16 */ val Long: typings.mongodb.mongodbMod.BSONType.Long with scala.Double = js.native
  /* 127 */ val MaxKey: typings.mongodb.mongodbMod.BSONType.MaxKey with scala.Double = js.native
  /* -1 */ val MinKey: typings.mongodb.mongodbMod.BSONType.MinKey with scala.Double = js.native
  /* 8 */ val Null: typings.mongodb.mongodbMod.BSONType.Null with scala.Double = js.native
  /* 1 */ val Object: typings.mongodb.mongodbMod.BSONType.Object with scala.Double = js.native
  /* 5 */ val ObjectId: typings.mongodb.mongodbMod.BSONType.ObjectId with scala.Double = js.native
  /* 9 */ val Regex: typings.mongodb.mongodbMod.BSONType.Regex with scala.Double = js.native
  /* 0 */ val String: typings.mongodb.mongodbMod.BSONType.String with scala.Double = js.native
  /* 12 */ val Symbol: typings.mongodb.mongodbMod.BSONType.Symbol with scala.Double = js.native
  /* 15 */ val Timestamp: typings.mongodb.mongodbMod.BSONType.Timestamp with scala.Double = js.native
  /* 4 */ val Undefined: typings.mongodb.mongodbMod.BSONType.Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[BSONType with scala.Double] = js.native
}

