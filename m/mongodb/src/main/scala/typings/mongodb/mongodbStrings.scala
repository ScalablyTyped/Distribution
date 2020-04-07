package typings.mongodb

import typings.mongodb.mod.BSONTypeAlias
import typings.mongodb.mod.ProfilingLevel
import typings.mongodb.mod.ReadConcernLevel
import typings.mongodb.mod.ReadPreferenceMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mongodbStrings {
  @js.native
  sealed trait AcceptedFields extends js.Object
  
  @js.native
  sealed trait DEFAULT extends js.Object
  
  @js.native
  sealed trait FilterQuery extends js.Object
  
  @js.native
  sealed trait GSSAPI extends js.Object
  
  @js.native
  sealed trait `MONGODB-CR` extends js.Object
  
  @js.native
  sealed trait `MONGODB-X509` extends js.Object
  
  @js.native
  sealed trait NotAcceptedFields extends js.Object
  
  @js.native
  sealed trait ObjectQuerySelector extends js.Object
  
  @js.native
  sealed trait PLAIN extends js.Object
  
  @js.native
  sealed trait PullAllOperator extends js.Object
  
  @js.native
  sealed trait PullOperator extends js.Object
  
  @js.native
  sealed trait PushOperator extends js.Object
  
  @js.native
  sealed trait ReadonlyPartial extends js.Object
  
  @js.native
  sealed trait `SCRAM-SHA-1` extends js.Object
  
  @js.native
  sealed trait `SCRAM-SHA-256` extends js.Object
  
  @js.native
  sealed trait SetFields extends js.Object
  
  @js.native
  sealed trait _empty extends js.Object
  
  @js.native
  sealed trait _id extends js.Object
  
  @js.native
  sealed trait all extends ProfilingLevel
  
  @js.native
  sealed trait array extends BSONTypeAlias
  
  @js.native
  sealed trait available extends ReadConcernLevel
  
  @js.native
  sealed trait binData extends BSONTypeAlias
  
  @js.native
  sealed trait bool extends BSONTypeAlias
  
  @js.native
  sealed trait date extends BSONTypeAlias
  
  @js.native
  sealed trait dbPointer extends BSONTypeAlias
  
  @js.native
  sealed trait decimal extends BSONTypeAlias
  
  @js.native
  sealed trait double extends BSONTypeAlias
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait int extends BSONTypeAlias
  
  @js.native
  sealed trait javascript extends BSONTypeAlias
  
  @js.native
  sealed trait javascriptWithScope extends BSONTypeAlias
  
  @js.native
  sealed trait linearizable extends ReadConcernLevel
  
  @js.native
  sealed trait local extends ReadConcernLevel
  
  @js.native
  sealed trait long extends BSONTypeAlias
  
  @js.native
  sealed trait majority extends ReadConcernLevel
  
  @js.native
  sealed trait maxKey extends BSONTypeAlias
  
  @js.native
  sealed trait minKey extends BSONTypeAlias
  
  @js.native
  sealed trait moderate extends js.Object
  
  @js.native
  sealed trait nearest extends ReadPreferenceMode
  
  @js.native
  sealed trait `null` extends BSONTypeAlias
  
  @js.native
  sealed trait number extends BSONTypeAlias
  
  @js.native
  sealed trait `object` extends BSONTypeAlias
  
  @js.native
  sealed trait objectId extends BSONTypeAlias
  
  @js.native
  sealed trait off extends ProfilingLevel
  
  @js.native
  sealed trait primary extends ReadPreferenceMode
  
  @js.native
  sealed trait primaryPreferred extends ReadPreferenceMode
  
  @js.native
  sealed trait regex extends BSONTypeAlias
  
  @js.native
  sealed trait secondary extends ReadPreferenceMode
  
  @js.native
  sealed trait secondaryPreferred extends ReadPreferenceMode
  
  @js.native
  sealed trait slow_only extends ProfilingLevel
  
  @js.native
  sealed trait snapshot extends ReadConcernLevel
  
  @js.native
  sealed trait strict extends js.Object
  
  @js.native
  sealed trait string extends BSONTypeAlias
  
  @js.native
  sealed trait symbol extends BSONTypeAlias
  
  @js.native
  sealed trait timestamp extends BSONTypeAlias
  
  @js.native
  sealed trait undefined extends BSONTypeAlias
  
  @js.native
  sealed trait warn extends js.Object
  
  @scala.inline
  def AcceptedFields: AcceptedFields = "AcceptedFields".asInstanceOf[AcceptedFields]
  @scala.inline
  def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  @scala.inline
  def FilterQuery: FilterQuery = "FilterQuery".asInstanceOf[FilterQuery]
  @scala.inline
  def GSSAPI: GSSAPI = "GSSAPI".asInstanceOf[GSSAPI]
  @scala.inline
  def `MONGODB-CR`: `MONGODB-CR` = "MONGODB-CR".asInstanceOf[`MONGODB-CR`]
  @scala.inline
  def `MONGODB-X509`: `MONGODB-X509` = "MONGODB-X509".asInstanceOf[`MONGODB-X509`]
  @scala.inline
  def NotAcceptedFields: NotAcceptedFields = "NotAcceptedFields".asInstanceOf[NotAcceptedFields]
  @scala.inline
  def ObjectQuerySelector: ObjectQuerySelector = "ObjectQuerySelector".asInstanceOf[ObjectQuerySelector]
  @scala.inline
  def PLAIN: PLAIN = "PLAIN".asInstanceOf[PLAIN]
  @scala.inline
  def PullAllOperator: PullAllOperator = "PullAllOperator".asInstanceOf[PullAllOperator]
  @scala.inline
  def PullOperator: PullOperator = "PullOperator".asInstanceOf[PullOperator]
  @scala.inline
  def PushOperator: PushOperator = "PushOperator".asInstanceOf[PushOperator]
  @scala.inline
  def ReadonlyPartial: ReadonlyPartial = "ReadonlyPartial".asInstanceOf[ReadonlyPartial]
  @scala.inline
  def `SCRAM-SHA-1`: `SCRAM-SHA-1` = "SCRAM-SHA-1".asInstanceOf[`SCRAM-SHA-1`]
  @scala.inline
  def `SCRAM-SHA-256`: `SCRAM-SHA-256` = "SCRAM-SHA-256".asInstanceOf[`SCRAM-SHA-256`]
  @scala.inline
  def SetFields: SetFields = "SetFields".asInstanceOf[SetFields]
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  @scala.inline
  def _id: _id = "_id".asInstanceOf[_id]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  @scala.inline
  def binData: binData = "binData".asInstanceOf[binData]
  @scala.inline
  def bool: bool = "bool".asInstanceOf[bool]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def dbPointer: dbPointer = "dbPointer".asInstanceOf[dbPointer]
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def int: int = "int".asInstanceOf[int]
  @scala.inline
  def javascript: javascript = "javascript".asInstanceOf[javascript]
  @scala.inline
  def javascriptWithScope: javascriptWithScope = "javascriptWithScope".asInstanceOf[javascriptWithScope]
  @scala.inline
  def linearizable: linearizable = "linearizable".asInstanceOf[linearizable]
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  @scala.inline
  def majority: majority = "majority".asInstanceOf[majority]
  @scala.inline
  def maxKey: maxKey = "maxKey".asInstanceOf[maxKey]
  @scala.inline
  def minKey: minKey = "minKey".asInstanceOf[minKey]
  @scala.inline
  def moderate: moderate = "moderate".asInstanceOf[moderate]
  @scala.inline
  def nearest: nearest = "nearest".asInstanceOf[nearest]
  @scala.inline
  def `null`: `null` = "null".asInstanceOf[`null`]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def objectId: objectId = "objectId".asInstanceOf[objectId]
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  @scala.inline
  def primary: primary = "primary".asInstanceOf[primary]
  @scala.inline
  def primaryPreferred: primaryPreferred = "primaryPreferred".asInstanceOf[primaryPreferred]
  @scala.inline
  def regex: regex = "regex".asInstanceOf[regex]
  @scala.inline
  def secondary: secondary = "secondary".asInstanceOf[secondary]
  @scala.inline
  def secondaryPreferred: secondaryPreferred = "secondaryPreferred".asInstanceOf[secondaryPreferred]
  @scala.inline
  def slow_only: slow_only = "slow_only".asInstanceOf[slow_only]
  @scala.inline
  def snapshot: snapshot = "snapshot".asInstanceOf[snapshot]
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
  @scala.inline
  def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  @scala.inline
  def undefined: undefined = "undefined".asInstanceOf[undefined]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

