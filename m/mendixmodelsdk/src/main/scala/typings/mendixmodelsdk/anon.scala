package typings.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable3
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.elementsMod.Element
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.iworkingcopyeventMod.BuildResultStatus
import typings.mendixmodelsdk.mendixmodelsdkStrings.Licensed
import typings.mendixmodelsdk.mendixmodelsdkStrings.Sandbox
import typings.mendixmodelsdk.mendixmodelsdkStrings.Unlicensed
import typings.mendixmodelsdk.mendixmodelsdkStrings.fail
import typings.mendixmodelsdk.mendixmodelsdkStrings.success_
import typings.mendixmodelsdk.structuresMod.Structure
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import typings.mendixmodelsdk.transportInterfacesMod.CannotFixAppState
import typings.mendixmodelsdk.transportInterfacesMod.IBuildError
import typings.mendixmodelsdk.transportInterfacesMod.IEnvironmentStatus
import typings.mendixmodelsdk.transportInterfacesMod.IProblem
import typings.mendixmodelsdk.transportInterfacesMod.SuccessAppState
import typings.mendixmodelsdk.utilsMod.utils.IMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppType
    extends StObject
       with IEnvironmentStatus {
    
    var appType: js.UndefOr[Licensed | Unlicensed | Sandbox] = js.undefined
    
    var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.undefined
    
    var buildstatus: String | Null
    
    var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.undefined
    
    var disk: Double
    
    var endpoint: String
    
    var environmentId: String
    
    var instances: Double
    
    var memory: Double
    
    var message: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var profile: String
    
    var state: SuccessAppState
    
    var `type`: success_
    
    var url: String
  }
  object AppType {
    
    inline def apply(
      disk: Double,
      endpoint: String,
      environmentId: String,
      instances: Double,
      memory: Double,
      name: String,
      profile: String,
      state: SuccessAppState,
      url: String
    ): AppType = {
      val __obj = js.Dynamic.literal(disk = disk.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], buildstatus = null)
      __obj.updateDynamic("type")("success")
      __obj.asInstanceOf[AppType]
    }
    
    extension [Self <: AppType](x: Self) {
      
      inline def setAppType(value: Licensed | Unlicensed | Sandbox): Self = StObject.set(x, "appType", value.asInstanceOf[js.Any])
      
      inline def setAppTypeUndefined: Self = StObject.set(x, "appType", js.undefined)
      
      inline def setBuildErrors(value: js.Array[IBuildError]): Self = StObject.set(x, "buildErrors", value.asInstanceOf[js.Any])
      
      inline def setBuildErrorsUndefined: Self = StObject.set(x, "buildErrors", js.undefined)
      
      inline def setBuildErrorsVarargs(value: IBuildError*): Self = StObject.set(x, "buildErrors", js.Array(value :_*))
      
      inline def setBuildstatus(value: String): Self = StObject.set(x, "buildstatus", value.asInstanceOf[js.Any])
      
      inline def setBuildstatusNull: Self = StObject.set(x, "buildstatus", null)
      
      inline def setConsistencyErrors(value: js.Array[IProblem]): Self = StObject.set(x, "consistencyErrors", value.asInstanceOf[js.Any])
      
      inline def setConsistencyErrorsUndefined: Self = StObject.set(x, "consistencyErrors", js.undefined)
      
      inline def setConsistencyErrorsVarargs(value: IProblem*): Self = StObject.set(x, "consistencyErrors", js.Array(value :_*))
      
      inline def setDisk(value: Double): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentId(value: String): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
      
      inline def setInstances(value: Double): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setState(value: SuccessAppState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setType(value: success_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cause
    extends StObject
       with IEnvironmentStatus {
    
    var cause: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var state: CannotFixAppState
    
    var `type`: fail
  }
  object Cause {
    
    inline def apply(state: CannotFixAppState): Cause = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fail")
      __obj.asInstanceOf[Cause]
    }
    
    extension [Self <: Cause](x: Self) {
      
      inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setState(value: CannotFixAppState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setType(value: fail): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Copy extends StObject {
    
    var copy: Element[IAbstractModel]
    
    var idMap: IMap[Structure[IAbstractModel, IContainer | Null]]
  }
  object Copy {
    
    inline def apply(copy: Element[IAbstractModel], idMap: IMap[Structure[IAbstractModel, IContainer | Null]]): Copy = {
      val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], idMap = idMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Copy]
    }
    
    extension [Self <: Copy](x: Self) {
      
      inline def setCopy(value: Element[IAbstractModel]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setIdMap(value: IMap[Structure[IAbstractModel, IContainer | Null]]): Self = StObject.set(x, "idMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventId extends StObject {
    
    var eventId: Double
    
    var message: String
    
    var problems: js.Array[js.Any]
    
    var status: BuildResultStatus
  }
  object EventId {
    
    inline def apply(eventId: Double, message: String, problems: js.Array[js.Any], status: BuildResultStatus): EventId = {
      val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], problems = problems.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventId]
    }
    
    extension [Self <: EventId](x: Self) {
      
      inline def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setProblems(value: js.Array[js.Any]): Self = StObject.set(x, "problems", value.asInstanceOf[js.Any])
      
      inline def setProblemsVarargs(value: js.Any*): Self = StObject.set(x, "problems", js.Array(value :_*))
      
      inline def setStatus(value: BuildResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HandleError extends StObject {
    
    def handleError(message: String): Unit = js.native
    def handleError(message: String, errorCallback: IErrorCallback): Unit = js.native
  }
  
  @js.native
  trait Instantiable[CT /* <: AbstractModel & IT */, IT /* <: IAbstractModel */]
    extends StObject
       with Instantiable3[
          /* _client */ IModelServerClient, 
          /* _errorHandler */ IErrorCallback, 
          /* _connectionConfig */ ISdkConfig, 
          CT
        ]
  
  trait ToRawChangeValue[P] extends StObject {
    
    def toRawChangeValue(value: P): js.Any
  }
  object ToRawChangeValue {
    
    inline def apply[P](toRawChangeValue: P => js.Any): ToRawChangeValue[P] = {
      val __obj = js.Dynamic.literal(toRawChangeValue = js.Any.fromFunction1(toRawChangeValue))
      __obj.asInstanceOf[ToRawChangeValue[P]]
    }
    
    extension [Self <: ToRawChangeValue[?], P](x: Self & ToRawChangeValue[P]) {
      
      inline def setToRawChangeValue(value: P => js.Any): Self = StObject.set(x, "toRawChangeValue", js.Any.fromFunction1(value))
    }
  }
}
