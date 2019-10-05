package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntityCollectionView extends js.Object {
  var entities: js.Array[IEntityView]
  var entityName: java.lang.String
  var minActiveRowVersion: java.lang.String
  var moreRecords: scala.Boolean
  var pagingCookie: java.lang.String
  var totalRecordCount: scala.Double
  var totalRecordCountLimitExceeded: scala.Boolean
}

object IEntityCollectionView {
  @scala.inline
  def apply(
    entities: js.Array[IEntityView],
    entityName: java.lang.String,
    minActiveRowVersion: java.lang.String,
    moreRecords: scala.Boolean,
    pagingCookie: java.lang.String,
    totalRecordCount: scala.Double,
    totalRecordCountLimitExceeded: scala.Boolean
  ): IEntityCollectionView = {
    val __obj = js.Dynamic.literal(entities = entities, entityName = entityName, minActiveRowVersion = minActiveRowVersion, moreRecords = moreRecords, pagingCookie = pagingCookie, totalRecordCount = totalRecordCount, totalRecordCountLimitExceeded = totalRecordCountLimitExceeded)
  
    __obj.asInstanceOf[IEntityCollectionView]
  }
}

