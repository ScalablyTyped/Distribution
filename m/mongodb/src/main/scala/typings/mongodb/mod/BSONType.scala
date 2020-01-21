package typings.mongodb.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[BSONType with scala.Double] = js.native
  /* 2 */ @js.native
  object Array
    extends TopLevel[Array with scala.Double]
  
  /* 3 */ @js.native
  object BinData
    extends TopLevel[BinData with scala.Double]
  
  /* 6 */ @js.native
  object Boolean
    extends TopLevel[Boolean with scala.Double]
  
  /* 10 */ @js.native
  object DBPointer
    extends TopLevel[DBPointer with scala.Double]
  
  /* 7 */ @js.native
  object Date
    extends TopLevel[Date with scala.Double]
  
  /* 17 */ @js.native
  object Decimal
    extends TopLevel[Decimal with scala.Double]
  
  /* 1 */ @js.native
  object Double
    extends TopLevel[typings.mongodb.mod.BSONType.Double with scala.Double]
  
  /* 14 */ @js.native
  object Int
    extends TopLevel[Int with scala.Double]
  
  /* 11 */ @js.native
  object JavaScript
    extends TopLevel[JavaScript with scala.Double]
  
  /* 13 */ @js.native
  object JavaScriptWithScope
    extends TopLevel[JavaScriptWithScope with scala.Double]
  
  /* 16 */ @js.native
  object Long
    extends TopLevel[typings.mongodb.mod.BSONType.Long with scala.Double]
  
  /* 127 */ @js.native
  object MaxKey
    extends TopLevel[typings.mongodb.mod.BSONType.MaxKey with scala.Double]
  
  /* -1 */ @js.native
  object MinKey
    extends TopLevel[typings.mongodb.mod.BSONType.MinKey with scala.Double]
  
  /* 8 */ @js.native
  object Null
    extends TopLevel[Null with scala.Double]
  
  /* 1 */ @js.native
  object Object
    extends TopLevel[Object with scala.Double]
  
  /* 5 */ @js.native
  object ObjectId
    extends TopLevel[typings.mongodb.mod.BSONType.ObjectId with scala.Double]
  
  /* 9 */ @js.native
  object Regex
    extends TopLevel[Regex with scala.Double]
  
  /* 0 */ @js.native
  object String
    extends TopLevel[String with scala.Double]
  
  /* 12 */ @js.native
  object Symbol
    extends TopLevel[Symbol with scala.Double]
  
  /* 15 */ @js.native
  object Timestamp
    extends TopLevel[typings.mongodb.mod.BSONType.Timestamp with scala.Double]
  
  /* 4 */ @js.native
  object Undefined
    extends TopLevel[Undefined with scala.Double]
  
}

