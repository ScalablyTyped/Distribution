package typings.microsoftSdkSoap.mod.global.Sdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEntityCollectionView extends StObject {
  
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
  implicit class IEntityCollectionViewMutableBuilder[Self <: IEntityCollectionView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[IEntityView]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: IEntityView*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setEntityName(value: java.lang.String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinActiveRowVersion(value: java.lang.String): Self = StObject.set(x, "minActiveRowVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreRecords(value: scala.Boolean): Self = StObject.set(x, "moreRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingCookie(value: java.lang.String): Self = StObject.set(x, "pagingCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRecordCount(value: scala.Double): Self = StObject.set(x, "totalRecordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRecordCountLimitExceeded(value: scala.Boolean): Self = StObject.set(x, "totalRecordCountLimitExceeded", value.asInstanceOf[js.Any])
  }
}
