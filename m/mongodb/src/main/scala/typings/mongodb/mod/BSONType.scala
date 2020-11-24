package typings.mongodb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BSONType extends js.Object
@JSImport("mongodb", "BSONType")
@js.native
object BSONType extends js.Object {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[BSONType with scala.Double] = js.native
  
  @js.native
  sealed trait Array extends BSONType
  /* 2 */ @js.native
  object Array
    extends TopLevel[Array with scala.Double]
  
  @js.native
  sealed trait BinData extends BSONType
  /* 3 */ @js.native
  object BinData
    extends TopLevel[BinData with scala.Double]
  
  @js.native
  sealed trait Boolean extends BSONType
  /* 6 */ @js.native
  object Boolean
    extends TopLevel[Boolean with scala.Double]
  
  /** @deprecated */
  @js.native
  sealed trait DBPointer extends BSONType
  /* 10 */ @js.native
  object DBPointer
    extends TopLevel[DBPointer with scala.Double]
  
  @js.native
  sealed trait Date extends BSONType
  /* 7 */ @js.native
  object Date
    extends TopLevel[Date with scala.Double]
  
  @js.native
  sealed trait Decimal extends BSONType
  /* 17 */ @js.native
  object Decimal
    extends TopLevel[Decimal with scala.Double]
  
  @js.native
  sealed trait Double extends BSONType
  /* 1 */ @js.native
  object Double
    extends TopLevel[typings.mongodb.mod.BSONType.Double with scala.Double]
  
  @js.native
  sealed trait Int extends BSONType
  /* 14 */ @js.native
  object Int
    extends TopLevel[Int with scala.Double]
  
  @js.native
  sealed trait JavaScript extends BSONType
  /* 11 */ @js.native
  object JavaScript
    extends TopLevel[JavaScript with scala.Double]
  
  @js.native
  sealed trait JavaScriptWithScope extends BSONType
  /* 13 */ @js.native
  object JavaScriptWithScope
    extends TopLevel[JavaScriptWithScope with scala.Double]
  
  @js.native
  sealed trait Long extends BSONType
  /* 16 */ @js.native
  object Long
    extends TopLevel[typings.mongodb.mod.BSONType.Long with scala.Double]
  
  @js.native
  sealed trait MaxKey extends BSONType
  /* 127 */ @js.native
  object MaxKey
    extends TopLevel[typings.mongodb.mod.BSONType.MaxKey with scala.Double]
  
  @js.native
  sealed trait MinKey extends BSONType
  /* -1 */ @js.native
  object MinKey
    extends TopLevel[typings.mongodb.mod.BSONType.MinKey with scala.Double]
  
  @js.native
  sealed trait Null extends BSONType
  /* 8 */ @js.native
  object Null
    extends TopLevel[Null with scala.Double]
  
  @js.native
  sealed trait Object extends BSONType
  /* 1 */ @js.native
  object Object
    extends TopLevel[Object with scala.Double]
  
  @js.native
  sealed trait ObjectId extends BSONType
  /* 5 */ @js.native
  object ObjectId
    extends TopLevel[typings.mongodb.mod.BSONType.ObjectId with scala.Double]
  
  @js.native
  sealed trait Regex extends BSONType
  /* 9 */ @js.native
  object Regex
    extends TopLevel[Regex with scala.Double]
  
  @js.native
  sealed trait String extends BSONType
  /* 0 */ @js.native
  object String
    extends TopLevel[String with scala.Double]
  
  /** @deprecated */
  @js.native
  sealed trait Symbol extends BSONType
  /* 12 */ @js.native
  object Symbol
    extends TopLevel[Symbol with scala.Double]
  
  @js.native
  sealed trait Timestamp extends BSONType
  /* 15 */ @js.native
  object Timestamp
    extends TopLevel[typings.mongodb.mod.BSONType.Timestamp with scala.Double]
  
  /** @deprecated */
  @js.native
  sealed trait Undefined extends BSONType
  /* 4 */ @js.native
  object Undefined
    extends TopLevel[Undefined with scala.Double]
}
