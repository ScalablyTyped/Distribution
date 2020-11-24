package typings.microsoftSdkSoap.mod.global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEntityCollectionView extends js.Object {
  
  var entities: js.Array[IEntityView] = js.native
  
  var entityName: java.lang.String = js.native
  
  var minActiveRowVersion: java.lang.String = js.native
  
  var moreRecords: scala.Boolean = js.native
  
  var pagingCookie: java.lang.String = js.native
  
  var totalRecordCount: scala.Double = js.native
  
  var totalRecordCountLimitExceeded: scala.Boolean = js.native
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
  
  @scala.inline
  implicit class IEntityCollectionViewOps[Self <: IEntityCollectionView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntitiesVarargs(value: IEntityView*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[IEntityView]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityName(value: java.lang.String): Self = this.set("entityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinActiveRowVersion(value: java.lang.String): Self = this.set("minActiveRowVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreRecords(value: scala.Boolean): Self = this.set("moreRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingCookie(value: java.lang.String): Self = this.set("pagingCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRecordCount(value: scala.Double): Self = this.set("totalRecordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRecordCountLimitExceeded(value: scala.Boolean): Self = this.set("totalRecordCountLimitExceeded", value.asInstanceOf[js.Any])
  }
}
