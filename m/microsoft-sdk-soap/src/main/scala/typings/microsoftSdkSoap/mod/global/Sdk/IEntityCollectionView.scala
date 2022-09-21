package typings.microsoftSdkSoap.mod.global.Sdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEntityCollectionView extends StObject {
  
  var entities: js.Array[IEntityView]
  
  var entityName: java.lang.String
  
  var minActiveRowVersion: java.lang.String
  
  var moreRecords: scala.Boolean
  
  var pagingCookie: java.lang.String
  
  var totalRecordCount: scala.Double
  
  var totalRecordCountLimitExceeded: scala.Boolean
}
object IEntityCollectionView {
  
  inline def apply(
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
  
  extension [Self <: IEntityCollectionView](x: Self) {
    
    inline def setEntities(value: js.Array[IEntityView]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: IEntityView*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setEntityName(value: java.lang.String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    inline def setMinActiveRowVersion(value: java.lang.String): Self = StObject.set(x, "minActiveRowVersion", value.asInstanceOf[js.Any])
    
    inline def setMoreRecords(value: scala.Boolean): Self = StObject.set(x, "moreRecords", value.asInstanceOf[js.Any])
    
    inline def setPagingCookie(value: java.lang.String): Self = StObject.set(x, "pagingCookie", value.asInstanceOf[js.Any])
    
    inline def setTotalRecordCount(value: scala.Double): Self = StObject.set(x, "totalRecordCount", value.asInstanceOf[js.Any])
    
    inline def setTotalRecordCountLimitExceeded(value: scala.Boolean): Self = StObject.set(x, "totalRecordCountLimitExceeded", value.asInstanceOf[js.Any])
  }
}
