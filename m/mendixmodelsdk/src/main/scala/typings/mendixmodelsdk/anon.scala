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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AppType extends IEnvironmentStatus {
    
    var appType: js.UndefOr[Licensed | Unlicensed | Sandbox] = js.native
    
    var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.native
    
    var buildstatus: String | Null = js.native
    
    var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.native
    
    var disk: Double = js.native
    
    var endpoint: String = js.native
    
    var environmentId: String = js.native
    
    var instances: Double = js.native
    
    var memory: Double = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var profile: String = js.native
    
    var state: SuccessAppState = js.native
    
    var `type`: success_ = js.native
    
    var url: String = js.native
  }
  object AppType {
    
    @scala.inline
    def apply(
      disk: Double,
      endpoint: String,
      environmentId: String,
      instances: Double,
      memory: Double,
      name: String,
      profile: String,
      state: SuccessAppState,
      `type`: success_,
      url: String
    ): AppType = {
      val __obj = js.Dynamic.literal(disk = disk.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppType]
    }
    
    @scala.inline
    implicit class AppTypeMutableBuilder[Self <: AppType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppType(value: Licensed | Unlicensed | Sandbox): Self = StObject.set(x, "appType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppTypeUndefined: Self = StObject.set(x, "appType", js.undefined)
      
      @scala.inline
      def setBuildErrors(value: js.Array[IBuildError]): Self = StObject.set(x, "buildErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildErrorsUndefined: Self = StObject.set(x, "buildErrors", js.undefined)
      
      @scala.inline
      def setBuildErrorsVarargs(value: IBuildError*): Self = StObject.set(x, "buildErrors", js.Array(value :_*))
      
      @scala.inline
      def setBuildstatus(value: String): Self = StObject.set(x, "buildstatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildstatusNull: Self = StObject.set(x, "buildstatus", null)
      
      @scala.inline
      def setConsistencyErrors(value: js.Array[IProblem]): Self = StObject.set(x, "consistencyErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsistencyErrorsUndefined: Self = StObject.set(x, "consistencyErrors", js.undefined)
      
      @scala.inline
      def setConsistencyErrorsVarargs(value: IProblem*): Self = StObject.set(x, "consistencyErrors", js.Array(value :_*))
      
      @scala.inline
      def setDisk(value: Double): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentId(value: String): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstances(value: Double): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: SuccessAppState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: success_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cause extends IEnvironmentStatus {
    
    var cause: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var state: CannotFixAppState = js.native
    
    var `type`: fail = js.native
  }
  object Cause {
    
    @scala.inline
    def apply(state: CannotFixAppState, `type`: fail): Cause = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cause]
    }
    
    @scala.inline
    implicit class CauseMutableBuilder[Self <: Cause] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setState(value: CannotFixAppState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: fail): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Copy extends StObject {
    
    var copy: Element[IAbstractModel] = js.native
    
    var idMap: IMap[Structure[IAbstractModel, IContainer | Null]] = js.native
  }
  object Copy {
    
    @scala.inline
    def apply(copy: Element[IAbstractModel], idMap: IMap[Structure[IAbstractModel, IContainer | Null]]): Copy = {
      val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], idMap = idMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Copy]
    }
    
    @scala.inline
    implicit class CopyMutableBuilder[Self <: Copy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopy(value: Element[IAbstractModel]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdMap(value: IMap[Structure[IAbstractModel, IContainer | Null]]): Self = StObject.set(x, "idMap", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventId extends StObject {
    
    var eventId: Double = js.native
    
    var message: String = js.native
    
    var problems: js.Array[_] = js.native
    
    var status: BuildResultStatus = js.native
  }
  object EventId {
    
    @scala.inline
    def apply(eventId: Double, message: String, problems: js.Array[_], status: BuildResultStatus): EventId = {
      val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], problems = problems.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventId]
    }
    
    @scala.inline
    implicit class EventIdMutableBuilder[Self <: EventId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProblems(value: js.Array[_]): Self = StObject.set(x, "problems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProblemsVarargs(value: js.Any*): Self = StObject.set(x, "problems", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: BuildResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HandleError extends StObject {
    
    def handleError(message: String): Unit = js.native
    def handleError(message: String, errorCallback: IErrorCallback): Unit = js.native
  }
  
  @js.native
  trait Instantiable[CT /* <: AbstractModel with IT */, IT /* <: IAbstractModel */] extends Instantiable3[
          /* _client */ IModelServerClient, 
          /* _errorHandler */ IErrorCallback, 
          /* _connectionConfig */ ISdkConfig, 
          CT
        ]
  
  @js.native
  trait ToRawChangeValue[P] extends StObject {
    
    def toRawChangeValue(value: P): js.Any = js.native
  }
  object ToRawChangeValue {
    
    @scala.inline
    def apply[P](toRawChangeValue: P => js.Any): ToRawChangeValue[P] = {
      val __obj = js.Dynamic.literal(toRawChangeValue = js.Any.fromFunction1(toRawChangeValue))
      __obj.asInstanceOf[ToRawChangeValue[P]]
    }
    
    @scala.inline
    implicit class ToRawChangeValueMutableBuilder[Self <: ToRawChangeValue[_], P] (val x: Self with ToRawChangeValue[P]) extends AnyVal {
      
      @scala.inline
      def setToRawChangeValue(value: P => js.Any): Self = StObject.set(x, "toRawChangeValue", js.Any.fromFunction1(value))
    }
  }
}
