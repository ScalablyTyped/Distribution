package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BSONType extends StObject
@JSImport("mongodb", "BSONType")
@js.native
object BSONType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[BSONType with scala.Double] = js.native
  
  @js.native
  sealed trait Array extends BSONType
  /* 2 */ val Array: typings.mongodb.mod.BSONType.Array with scala.Double = js.native
  
  @js.native
  sealed trait BinData extends BSONType
  /* 3 */ val BinData: typings.mongodb.mod.BSONType.BinData with scala.Double = js.native
  
  @js.native
  sealed trait Boolean extends BSONType
  /* 6 */ val Boolean: typings.mongodb.mod.BSONType.Boolean with scala.Double = js.native
  
  /** @deprecated */
  @js.native
  sealed trait DBPointer extends BSONType
  /* 10 */ val DBPointer: typings.mongodb.mod.BSONType.DBPointer with scala.Double = js.native
  
  @js.native
  sealed trait Date extends BSONType
  /* 7 */ val Date: typings.mongodb.mod.BSONType.Date with scala.Double = js.native
  
  @js.native
  sealed trait Decimal extends BSONType
  /* 17 */ val Decimal: typings.mongodb.mod.BSONType.Decimal with scala.Double = js.native
  
  @js.native
  sealed trait Double extends BSONType
  /* 1 */ val Double: typings.mongodb.mod.BSONType.Double with scala.Double = js.native
  
  @js.native
  sealed trait Int extends BSONType
  /* 14 */ val Int: typings.mongodb.mod.BSONType.Int with scala.Double = js.native
  
  @js.native
  sealed trait JavaScript extends BSONType
  /* 11 */ val JavaScript: typings.mongodb.mod.BSONType.JavaScript with scala.Double = js.native
  
  @js.native
  sealed trait JavaScriptWithScope extends BSONType
  /* 13 */ val JavaScriptWithScope: typings.mongodb.mod.BSONType.JavaScriptWithScope with scala.Double = js.native
  
  @js.native
  sealed trait Long extends BSONType
  /* 16 */ val Long: typings.mongodb.mod.BSONType.Long with scala.Double = js.native
  
  @js.native
  sealed trait MaxKey extends BSONType
  /* 127 */ val MaxKey: typings.mongodb.mod.BSONType.MaxKey with scala.Double = js.native
  
  @js.native
  sealed trait MinKey extends BSONType
  /* -1 */ val MinKey: typings.mongodb.mod.BSONType.MinKey with scala.Double = js.native
  
  @js.native
  sealed trait Null extends BSONType
  /* 8 */ val Null: typings.mongodb.mod.BSONType.Null with scala.Double = js.native
  
  @js.native
  sealed trait Object extends BSONType
  /* 1 */ val Object: typings.mongodb.mod.BSONType.Object with scala.Double = js.native
  
  @js.native
  sealed trait ObjectId extends BSONType
  /* 5 */ val ObjectId: typings.mongodb.mod.BSONType.ObjectId with scala.Double = js.native
  
  @js.native
  sealed trait Regex extends BSONType
  /* 9 */ val Regex: typings.mongodb.mod.BSONType.Regex with scala.Double = js.native
  
  @js.native
  sealed trait String extends BSONType
  /* 0 */ val String: typings.mongodb.mod.BSONType.String with scala.Double = js.native
  
  /** @deprecated */
  @js.native
  sealed trait Symbol extends BSONType
  /* 12 */ val Symbol: typings.mongodb.mod.BSONType.Symbol with scala.Double = js.native
  
  @js.native
  sealed trait Timestamp extends BSONType
  /* 15 */ val Timestamp: typings.mongodb.mod.BSONType.Timestamp with scala.Double = js.native
  
  /** @deprecated */
  @js.native
  sealed trait Undefined extends BSONType
  /* 4 */ val Undefined: typings.mongodb.mod.BSONType.Undefined with scala.Double = js.native
}
