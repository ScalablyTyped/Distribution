package typings.pollyjsCore.mod

import typings.pollyjsCore.anon.Body
import typings.pollyjsCore.anon.Dictkey
import typings.pollyjsCore.anon.DisableSortingHarEntries
import typings.pollyjsCore.anon.TypeofPersister
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PollyConfig extends js.Object {
  
  var adapterOptions: js.UndefOr[Dictkey] = js.native
  
  var adapters: js.UndefOr[
    js.Array[
      String | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Adapter */ _)
    ]
  ] = js.native
  
  var expiresIn: js.UndefOr[String | Null] = js.native
  
  var expiryStrategy: js.UndefOr[EXPIRY_STRATEGY] = js.native
  
  var flushRequestsOnStop: js.UndefOr[Boolean] = js.native
  
  var logging: js.UndefOr[Boolean] = js.native
  
  var matchRequestsBy: js.UndefOr[Body] = js.native
  
  var mode: js.UndefOr[MODE] = js.native
  
  var persister: js.UndefOr[String | TypeofPersister] = js.native
  
  var persisterOptions: js.UndefOr[DisableSortingHarEntries] = js.native
  
  var recordFailedRequests: js.UndefOr[Boolean] = js.native
  
  var recordIfMissing: js.UndefOr[Boolean] = js.native
  
  var timing: js.UndefOr[
    (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]]
  ] = js.native
}
object PollyConfig {
  
  @scala.inline
  def apply(): PollyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollyConfig]
  }
  
  @scala.inline
  implicit class PollyConfigOps[Self <: PollyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdapterOptions(value: Dictkey): Self = this.set("adapterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapterOptions: Self = this.set("adapterOptions", js.undefined)
    
    @scala.inline
    def setAdaptersVarargs(value: (String | js.Any)*): Self = this.set("adapters", js.Array(value :_*))
    
    @scala.inline
    def setAdapters(
      value: js.Array[
          String | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Adapter */ _)
        ]
    ): Self = this.set("adapters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapters: Self = this.set("adapters", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: String): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    
    @scala.inline
    def setExpiresInNull: Self = this.set("expiresIn", null)
    
    @scala.inline
    def setExpiryStrategy(value: EXPIRY_STRATEGY): Self = this.set("expiryStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiryStrategy: Self = this.set("expiryStrategy", js.undefined)
    
    @scala.inline
    def setFlushRequestsOnStop(value: Boolean): Self = this.set("flushRequestsOnStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlushRequestsOnStop: Self = this.set("flushRequestsOnStop", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setMatchRequestsBy(value: Body): Self = this.set("matchRequestsBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchRequestsBy: Self = this.set("matchRequestsBy", js.undefined)
    
    @scala.inline
    def setMode(value: MODE): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setPersister(value: String | TypeofPersister): Self = this.set("persister", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersister: Self = this.set("persister", js.undefined)
    
    @scala.inline
    def setPersisterOptions(value: DisableSortingHarEntries): Self = this.set("persisterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersisterOptions: Self = this.set("persisterOptions", js.undefined)
    
    @scala.inline
    def setRecordFailedRequests(value: Boolean): Self = this.set("recordFailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordFailedRequests: Self = this.set("recordFailedRequests", js.undefined)
    
    @scala.inline
    def setRecordIfMissing(value: Boolean): Self = this.set("recordIfMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordIfMissing: Self = this.set("recordIfMissing", js.undefined)
    
    @scala.inline
    def setTimingFunction1(value: /* ms */ Double => js.Promise[Unit]): Self = this.set("timing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimingFunction0(value: () => js.Promise[Unit]): Self = this.set("timing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTiming(value: (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]]): Self = this.set("timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
  }
}
