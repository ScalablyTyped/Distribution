package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BSONType extends StObject
@JSImport("mongodb", "BSONType")
@js.native
object BSONType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[BSONType & scala.Double] = js.native
  
  @js.native
  sealed trait Array
    extends StObject
       with BSONType
  /* 2 */ val Array: typings.mongodb.mod.BSONType.Array & scala.Double = js.native
  
  @js.native
  sealed trait BinData
    extends StObject
       with BSONType
  /* 3 */ val BinData: typings.mongodb.mod.BSONType.BinData & scala.Double = js.native
  
  @js.native
  sealed trait Boolean
    extends StObject
       with BSONType
  /* 6 */ val Boolean: typings.mongodb.mod.BSONType.Boolean & scala.Double = js.native
  
  /** @deprecated */
  @js.native
  sealed trait DBPointer
    extends StObject
       with BSONType
  /* 10 */ val DBPointer: typings.mongodb.mod.BSONType.DBPointer & scala.Double = js.native
  
  @js.native
  sealed trait Date
    extends StObject
       with BSONType
  /* 7 */ val Date: typings.mongodb.mod.BSONType.Date & scala.Double = js.native
  
  @js.native
  sealed trait Decimal
    extends StObject
       with BSONType
  /* 17 */ val Decimal: typings.mongodb.mod.BSONType.Decimal & scala.Double = js.native
  
  @js.native
  sealed trait Double
    extends StObject
       with BSONType
  /* 1 */ val Double: typings.mongodb.mod.BSONType.Double & scala.Double = js.native
  
  @js.native
  sealed trait Int
    extends StObject
       with BSONType
  /* 14 */ val Int: typings.mongodb.mod.BSONType.Int & scala.Double = js.native
  
  @js.native
  sealed trait JavaScript
    extends StObject
       with BSONType
  /* 11 */ val JavaScript: typings.mongodb.mod.BSONType.JavaScript & scala.Double = js.native
  
  @js.native
  sealed trait JavaScriptWithScope
    extends StObject
       with BSONType
  /* 13 */ val JavaScriptWithScope: typings.mongodb.mod.BSONType.JavaScriptWithScope & scala.Double = js.native
  
  @js.native
  sealed trait Long
    extends StObject
       with BSONType
  /* 16 */ val Long: typings.mongodb.mod.BSONType.Long & scala.Double = js.native
  
  @js.native
  sealed trait MaxKey
    extends StObject
       with BSONType
  /* 127 */ val MaxKey: typings.mongodb.mod.BSONType.MaxKey & scala.Double = js.native
  
  @js.native
  sealed trait MinKey
    extends StObject
       with BSONType
  /* -1 */ val MinKey: typings.mongodb.mod.BSONType.MinKey & scala.Double = js.native
  
  @js.native
  sealed trait Null
    extends StObject
       with BSONType
  /* 8 */ val Null: typings.mongodb.mod.BSONType.Null & scala.Double = js.native
  
  @js.native
  sealed trait Object
    extends StObject
       with BSONType
  /* 1 */ val Object: typings.mongodb.mod.BSONType.Object & scala.Double = js.native
  
  @js.native
  sealed trait ObjectId
    extends StObject
       with BSONType
  /* 5 */ val ObjectId: typings.mongodb.mod.BSONType.ObjectId & scala.Double = js.native
  
  @js.native
  sealed trait Regex
    extends StObject
       with BSONType
  /* 9 */ val Regex: typings.mongodb.mod.BSONType.Regex & scala.Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with BSONType
  /* 0 */ val String: typings.mongodb.mod.BSONType.String & scala.Double = js.native
  
  /** @deprecated */
  @js.native
  sealed trait Symbol
    extends StObject
       with BSONType
  /* 12 */ val Symbol: typings.mongodb.mod.BSONType.Symbol & scala.Double = js.native
  
  @js.native
  sealed trait Timestamp
    extends StObject
       with BSONType
  /* 15 */ val Timestamp: typings.mongodb.mod.BSONType.Timestamp & scala.Double = js.native
  
  /** @deprecated */
  @js.native
  sealed trait Undefined
    extends StObject
       with BSONType
  /* 4 */ val Undefined: typings.mongodb.mod.BSONType.Undefined & scala.Double = js.native
}
