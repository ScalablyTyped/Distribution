package typings.microsoftSdkSoap.mod.global.Sdk

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
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], entityName = entityName.asInstanceOf[js.Any], minActiveRowVersion = minActiveRowVersion.asInstanceOf[js.Any], moreRecords = moreRecords.asInstanceOf[js.Any], pagingCookie = pagingCookie.asInstanceOf[js.Any], totalRecordCount = totalRecordCount.asInstanceOf[js.Any], totalRecordCountLimitExceeded = totalRecordCountLimitExceeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityCollectionView]
  }
}

