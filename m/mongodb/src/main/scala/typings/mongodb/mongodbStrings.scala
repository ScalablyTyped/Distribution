package typings.mongodb

import typings.mongodb.mod.BSONTypeAlias
import typings.mongodb.mod.ChangeEventTypes
import typings.mongodb.mod.MetaProjectionOperators
import typings.mongodb.mod.MetaSortOperators
import typings.mongodb.mod.ProfilingLevel
import typings.mongodb.mod.ReadConcernLevel
import typings.mongodb.mod.ReadPreferenceMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongodbStrings {
  
  @js.native
  sealed trait AcceptedFields extends StObject
  @scala.inline
  def AcceptedFields: AcceptedFields = "AcceptedFields".asInstanceOf[AcceptedFields]
  
  @js.native
  sealed trait DEFAULT extends StObject
  @scala.inline
  def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  
  @js.native
  sealed trait FilterQuery extends StObject
  @scala.inline
  def FilterQuery: FilterQuery = "FilterQuery".asInstanceOf[FilterQuery]
  
  @js.native
  sealed trait FindOneOptions extends StObject
  @scala.inline
  def FindOneOptions: FindOneOptions = "FindOneOptions".asInstanceOf[FindOneOptions]
  
  @js.native
  sealed trait GSSAPI extends StObject
  @scala.inline
  def GSSAPI: GSSAPI = "GSSAPI".asInstanceOf[GSSAPI]
  
  @js.native
  sealed trait `MONGODB-CR` extends StObject
  @scala.inline
  def `MONGODB-CR`: `MONGODB-CR` = "MONGODB-CR".asInstanceOf[`MONGODB-CR`]
  
  @js.native
  sealed trait `MONGODB-X509` extends StObject
  @scala.inline
  def `MONGODB-X509`: `MONGODB-X509` = "MONGODB-X509".asInstanceOf[`MONGODB-X509`]
  
  @js.native
  sealed trait NotAcceptedFields extends StObject
  @scala.inline
  def NotAcceptedFields: NotAcceptedFields = "NotAcceptedFields".asInstanceOf[NotAcceptedFields]
  
  @js.native
  sealed trait ObjectQuerySelector extends StObject
  @scala.inline
  def ObjectQuerySelector: ObjectQuerySelector = "ObjectQuerySelector".asInstanceOf[ObjectQuerySelector]
  
  @js.native
  sealed trait PLAIN extends StObject
  @scala.inline
  def PLAIN: PLAIN = "PLAIN".asInstanceOf[PLAIN]
  
  @js.native
  sealed trait PullAllOperator extends StObject
  @scala.inline
  def PullAllOperator: PullAllOperator = "PullAllOperator".asInstanceOf[PullAllOperator]
  
  @js.native
  sealed trait PullOperator extends StObject
  @scala.inline
  def PullOperator: PullOperator = "PullOperator".asInstanceOf[PullOperator]
  
  @js.native
  sealed trait PushOperator extends StObject
  @scala.inline
  def PushOperator: PushOperator = "PushOperator".asInstanceOf[PushOperator]
  
  @js.native
  sealed trait ReadonlyPartial extends StObject
  @scala.inline
  def ReadonlyPartial: ReadonlyPartial = "ReadonlyPartial".asInstanceOf[ReadonlyPartial]
  
  @js.native
  sealed trait `SCRAM-SHA-1` extends StObject
  @scala.inline
  def `SCRAM-SHA-1`: `SCRAM-SHA-1` = "SCRAM-SHA-1".asInstanceOf[`SCRAM-SHA-1`]
  
  @js.native
  sealed trait `SCRAM-SHA-256` extends StObject
  @scala.inline
  def `SCRAM-SHA-256`: `SCRAM-SHA-256` = "SCRAM-SHA-256".asInstanceOf[`SCRAM-SHA-256`]
  
  @js.native
  sealed trait SchemaMember extends StObject
  @scala.inline
  def SchemaMember: SchemaMember = "SchemaMember".asInstanceOf[SchemaMember]
  
  @js.native
  sealed trait SetFields extends StObject
  @scala.inline
  def SetFields: SetFields = "SetFields".asInstanceOf[SetFields]
  
  @js.native
  sealed trait UpdateQuery extends StObject
  @scala.inline
  def UpdateQuery: UpdateQuery = "UpdateQuery".asInstanceOf[UpdateQuery]
  
  @js.native
  sealed trait _empty extends StObject
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait _id extends StObject
  @scala.inline
  def _id: _id = "_id".asInstanceOf[_id]
  
  @js.native
  sealed trait all extends ProfilingLevel
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait array extends BSONTypeAlias
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait available extends ReadConcernLevel
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait binData extends BSONTypeAlias
  @scala.inline
  def binData: binData = "binData".asInstanceOf[binData]
  
  @js.native
  sealed trait bool extends BSONTypeAlias
  @scala.inline
  def bool: bool = "bool".asInstanceOf[bool]
  
  @js.native
  sealed trait date extends BSONTypeAlias
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait dbPointer extends BSONTypeAlias
  @scala.inline
  def dbPointer: dbPointer = "dbPointer".asInstanceOf[dbPointer]
  
  @js.native
  sealed trait decimal extends BSONTypeAlias
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait default_ extends StObject
  @scala.inline
  def default_ : default_ = "default".asInstanceOf[default_]
  
  @js.native
  sealed trait delete extends ChangeEventTypes
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait double extends BSONTypeAlias
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  
  @js.native
  sealed trait drop extends ChangeEventTypes
  @scala.inline
  def drop: drop = "drop".asInstanceOf[drop]
  
  @js.native
  sealed trait dropDatabase extends ChangeEventTypes
  @scala.inline
  def dropDatabase: dropDatabase = "dropDatabase".asInstanceOf[dropDatabase]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait indexKey
    extends MetaProjectionOperators
       with MetaSortOperators
  @scala.inline
  def indexKey: indexKey = "indexKey".asInstanceOf[indexKey]
  
  @js.native
  sealed trait insert extends ChangeEventTypes
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait int extends BSONTypeAlias
  @scala.inline
  def int: int = "int".asInstanceOf[int]
  
  @js.native
  sealed trait invalidate extends ChangeEventTypes
  @scala.inline
  def invalidate: invalidate = "invalidate".asInstanceOf[invalidate]
  
  @js.native
  sealed trait javascript extends BSONTypeAlias
  @scala.inline
  def javascript: javascript = "javascript".asInstanceOf[javascript]
  
  @js.native
  sealed trait javascriptWithScope extends BSONTypeAlias
  @scala.inline
  def javascriptWithScope: javascriptWithScope = "javascriptWithScope".asInstanceOf[javascriptWithScope]
  
  @js.native
  sealed trait linearizable extends ReadConcernLevel
  @scala.inline
  def linearizable: linearizable = "linearizable".asInstanceOf[linearizable]
  
  @js.native
  sealed trait local extends ReadConcernLevel
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait long extends BSONTypeAlias
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  
  @js.native
  sealed trait majority extends ReadConcernLevel
  @scala.inline
  def majority: majority = "majority".asInstanceOf[majority]
  
  @js.native
  sealed trait maxKey extends BSONTypeAlias
  @scala.inline
  def maxKey: maxKey = "maxKey".asInstanceOf[maxKey]
  
  @js.native
  sealed trait minKey extends BSONTypeAlias
  @scala.inline
  def minKey: minKey = "minKey".asInstanceOf[minKey]
  
  @js.native
  sealed trait moderate extends StObject
  @scala.inline
  def moderate: moderate = "moderate".asInstanceOf[moderate]
  
  @js.native
  sealed trait nearest extends ReadPreferenceMode
  @scala.inline
  def nearest: nearest = "nearest".asInstanceOf[nearest]
  
  @js.native
  sealed trait `null` extends BSONTypeAlias
  @scala.inline
  def `null`: `null` = "null".asInstanceOf[`null`]
  
  @js.native
  sealed trait number extends BSONTypeAlias
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object` extends BSONTypeAlias
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait objectId extends BSONTypeAlias
  @scala.inline
  def objectId: objectId = "objectId".asInstanceOf[objectId]
  
  @js.native
  sealed trait off extends ProfilingLevel
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait primary extends ReadPreferenceMode
  @scala.inline
  def primary: primary = "primary".asInstanceOf[primary]
  
  @js.native
  sealed trait primaryPreferred extends ReadPreferenceMode
  @scala.inline
  def primaryPreferred: primaryPreferred = "primaryPreferred".asInstanceOf[primaryPreferred]
  
  @js.native
  sealed trait regex extends BSONTypeAlias
  @scala.inline
  def regex: regex = "regex".asInstanceOf[regex]
  
  @js.native
  sealed trait rename extends ChangeEventTypes
  @scala.inline
  def rename: rename = "rename".asInstanceOf[rename]
  
  @js.native
  sealed trait replace extends ChangeEventTypes
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait searchHighlights extends MetaProjectionOperators
  @scala.inline
  def searchHighlights: searchHighlights = "searchHighlights".asInstanceOf[searchHighlights]
  
  @js.native
  sealed trait searchScore extends MetaProjectionOperators
  @scala.inline
  def searchScore: searchScore = "searchScore".asInstanceOf[searchScore]
  
  @js.native
  sealed trait secondary extends ReadPreferenceMode
  @scala.inline
  def secondary: secondary = "secondary".asInstanceOf[secondary]
  
  @js.native
  sealed trait secondaryPreferred extends ReadPreferenceMode
  @scala.inline
  def secondaryPreferred: secondaryPreferred = "secondaryPreferred".asInstanceOf[secondaryPreferred]
  
  @js.native
  sealed trait slow_only extends ProfilingLevel
  @scala.inline
  def slow_only: slow_only = "slow_only".asInstanceOf[slow_only]
  
  @js.native
  sealed trait snappy extends StObject
  @scala.inline
  def snappy: snappy = "snappy".asInstanceOf[snappy]
  
  @js.native
  sealed trait snapshot extends ReadConcernLevel
  @scala.inline
  def snapshot: snapshot = "snapshot".asInstanceOf[snapshot]
  
  @js.native
  sealed trait strict extends StObject
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait string extends BSONTypeAlias
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait symbol extends BSONTypeAlias
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @js.native
  sealed trait textScore
    extends MetaProjectionOperators
       with MetaSortOperators
  @scala.inline
  def textScore: textScore = "textScore".asInstanceOf[textScore]
  
  @js.native
  sealed trait timestamp extends BSONTypeAlias
  @scala.inline
  def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  
  @js.native
  sealed trait undefined extends BSONTypeAlias
  @scala.inline
  def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait update extends ChangeEventTypes
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait updateLookup extends StObject
  @scala.inline
  def updateLookup: updateLookup = "updateLookup".asInstanceOf[updateLookup]
  
  @js.native
  sealed trait warn extends StObject
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait zlib extends StObject
  @scala.inline
  def zlib: zlib = "zlib".asInstanceOf[zlib]
}
