package typings.mobxTask

import typings.mobxTask.mobxTaskStrings.error
import typings.mobxTask.mobxTaskStrings.result
import typings.mobxTask.mobxTaskStrings.state
import typings.mobxTask.mobxTaskStrings.swallow
import typings.std.Exclude
import typings.std.MethodDecorator
import typings.std.Pick
import typings.std.PropertyDecorator
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskMod {
  
  /**
    * Creates a task in the `pending` state.
    */
  @JSImport("mobx-task/lib/task", "task")
  @js.native
  val task: TaskFactory = js.native
  
  @js.native
  trait TaskCreator[K /* <: /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | typings.mobxTask.mobxTaskStrings.args | swallow */]
    extends MethodDecorator
       with PropertyDecorator {
    
    def apply(options: Pick[TaskOptions[Any, Any], K]): PropertyDecorator = js.native
    /**
      * Calls the actual task function.
      */
    def apply[A /* <: js.Array[Any] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
    def apply[A /* <: js.Array[Any] */, R](func: js.Function1[/* args */ A, R], options: Pick[TaskOptions[A, R], K]): Task_[A, R] = js.native
    
    /* InferMemberOverrides */
    override def apply(arg1: /* target */ js.Object, arg2: /* propertyKey */ String | js.Symbol): Unit = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* target */ js.Object,
      arg2: /* propertyKey */ String | js.Symbol,
      arg3: /* descriptor */ TypedPropertyDescriptor[Any]
    ): TypedPropertyDescriptor[Any] | Unit = js.native
  }
  
  @js.native
  trait TaskFactory
    extends TaskCreator[
          /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | typings.mobxTask.mobxTaskStrings.args | swallow
        ] {
    
    /**
      * Calls the actual task function.
      */
    /**
      * Creates a task in the `rejected` state.
      */
    def rejected[A /* <: js.Array[Any] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
    /**
      * Creates a task in the `rejected` state.
      */
    @JSName("rejected")
    var rejected_Original: TaskCreator[
        Exclude[
          /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | typings.mobxTask.mobxTaskStrings.args | swallow, 
          state
        ]
      ] = js.native
    /**
      * Creates a task in the `rejected` state.
      */
    @JSName("rejected")
    def rejected_state(
      options: Pick[
          TaskOptions[Any, Any], 
          Exclude[
            /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | typings.mobxTask.mobxTaskStrings.args | swallow, 
            state
          ]
        ]
    ): PropertyDecorator = js.native
    @JSName("rejected")
    def rejected_state[A /* <: js.Array[Any] */, R](
      func: js.Function1[/* args */ A, R],
      options: Pick[
          TaskOptions[A, R], 
          Exclude[
            /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | typings.mobxTask.mobxTaskStrings.args | swallow, 
            state
          ]
        ]
    ): Task_[A, R] = js.native
    /**
      * Creates a task in the `rejected` state.
      */
    @JSName("rejected")
    def rejected_state_MethodDecorator(
      options: Pick[
          TaskOptions[Any, Any], 
          Exclude[
            /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | typings.mobxTask.mobxTaskStrings.args | swallow, 
            state
          ]
        ]
    ): MethodDecorator = js.native
    
    /**
      * Calls the actual task function.
      */
    /**
      * Creates a task in the `resolved` state.
      */
    def resolved[A /* <: js.Array[Any] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
    /**
      * Creates a task in the `resolved` state.
      */
    @JSName("resolved")
    var resolved_Original: TaskCreator[
        Exclude[
          /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | typings.mobxTask.mobxTaskStrings.args | swallow, 
          state
        ]
      ] = js.native
    /**
      * Creates a task in the `resolved` state.
      */
    @JSName("resolved")
    def resolved_state(
      options: Pick[
          TaskOptions[Any, Any], 
          Exclude[
            /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | typings.mobxTask.mobxTaskStrings.args | swallow, 
            state
          ]
        ]
    ): PropertyDecorator = js.native
    @JSName("resolved")
    def resolved_state[A /* <: js.Array[Any] */, R](
      func: js.Function1[/* args */ A, R],
      options: Pick[
          TaskOptions[A, R], 
          Exclude[
            /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | typings.mobxTask.mobxTaskStrings.args | swallow, 
            state
          ]
        ]
    ): Task_[A, R] = js.native
    /**
      * Creates a task in the `resolved` state.
      */
    @JSName("resolved")
    def resolved_state_MethodDecorator(
      options: Pick[
          TaskOptions[Any, Any], 
          Exclude[
            /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | typings.mobxTask.mobxTaskStrings.args | swallow, 
            state
          ]
        ]
    ): MethodDecorator = js.native
  }
  
  type TaskFunc[A /* <: js.Array[Any] */, R] = js.Function1[/* args */ A, js.Promise[R]]
  
  trait TaskMatchProps[T1, T2, T3, A /* <: js.Array[Any] */, R] extends StObject {
    
    var pending: js.UndefOr[js.Function1[/* args */ A, T1]] = js.undefined
    
    var rejected: js.UndefOr[js.Function1[/* error */ Any, T2]] = js.undefined
    
    var resolved: js.UndefOr[js.Function1[/* result */ WithoutPromise[R], T3]] = js.undefined
  }
  object TaskMatchProps {
    
    inline def apply[T1, T2, T3, A /* <: js.Array[Any] */, R](): TaskMatchProps[T1, T2, T3, A, R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskMatchProps[T1, T2, T3, A, R]]
    }
    
    extension [Self <: TaskMatchProps[?, ?, ?, ?, ?], T1, T2, T3, A /* <: js.Array[Any] */, R](x: Self & (TaskMatchProps[T1, T2, T3, A, R])) {
      
      inline def setPending(value: /* args */ A => T1): Self = StObject.set(x, "pending", js.Any.fromFunction1(value))
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setRejected(value: /* error */ Any => T2): Self = StObject.set(x, "rejected", js.Any.fromFunction1(value))
      
      inline def setRejectedUndefined: Self = StObject.set(x, "rejected", js.undefined)
      
      inline def setResolved(value: /* result */ WithoutPromise[R] => T3): Self = StObject.set(x, "resolved", js.Any.fromFunction1(value))
      
      inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    }
  }
  
  trait TaskMethods[A /* <: js.Array[Any] */, R] extends StObject {
    
    /**
      * Pattern-matches on the task status.
      * @param props
      */
    def `match`[PT, ET, RT](props: TaskMatchProps[PT, ET, RT, A, R]): PT | ET | RT
    
    /**
      * Resets the state.
      */
    def reset(): Unit
    
    /**
      * Sets the state.
      */
    def setState(props: TaskOptions[A, R]): Unit
    
    /**
      * Wraps the task by invoking `func` with the inner task function, which returns the wrapped function
      * and converts that to a task.
      *
      * @param func
      */
    def wrap[NA /* <: js.Array[Any] */, NR](func: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[/* args */ NA, NR]]): Task_[NA, NR]
  }
  object TaskMethods {
    
    inline def apply[A /* <: js.Array[Any] */, R](
      `match`: TaskMatchProps[Any, Any, Any, A, R] => Any | Any | Any,
      reset: () => Unit,
      setState: TaskOptions[A, R] => Unit,
      wrap: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[Any, Any]] => Task_[Any, Any]
    ): TaskMethods[A, R] = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), setState = js.Any.fromFunction1(setState), wrap = js.Any.fromFunction1(wrap))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[TaskMethods[A, R]]
    }
    
    extension [Self <: TaskMethods[?, ?], A /* <: js.Array[Any] */, R](x: Self & (TaskMethods[A, R])) {
      
      inline def setMatch(value: TaskMatchProps[Any, Any, Any, A, R] => Any | Any | Any): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSetState(value: TaskOptions[A, R] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      inline def setWrap(
        value: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[Any, Any]] => Task_[Any, Any]
      ): Self = StObject.set(x, "wrap", js.Any.fromFunction1(value))
    }
  }
  
  trait TaskOptions[A /* <: js.Array[Any] */, R] extends StObject {
    
    var args: js.UndefOr[A] = js.undefined
    
    var error: js.UndefOr[Any] = js.undefined
    
    var result: js.UndefOr[WithoutPromise[R]] = js.undefined
    
    var state: js.UndefOr[TaskStatus] = js.undefined
    
    var swallow: js.UndefOr[Boolean] = js.undefined
  }
  object TaskOptions {
    
    inline def apply[A /* <: js.Array[Any] */, R](): TaskOptions[A, R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskOptions[A, R]]
    }
    
    extension [Self <: TaskOptions[?, ?], A /* <: js.Array[Any] */, R](x: Self & (TaskOptions[A, R])) {
      
      inline def setArgs(value: A): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResult(value: WithoutPromise[R]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setState(value: TaskStatus): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSwallow(value: Boolean): Self = StObject.set(x, "swallow", value.asInstanceOf[js.Any])
      
      inline def setSwallowUndefined: Self = StObject.set(x, "swallow", js.undefined)
    }
  }
  
  trait TaskState[A /* <: js.Array[Any] */, R] extends StObject {
    
    /**
      * The last arguments passed to the task.
      */
    val args: A
    
    /**
      * The error of the last failed invocation.
      */
    val error: js.UndefOr[Any] = js.undefined
    
    /**
      * Convenience getter for `state === 'pending'`.
      */
    val pending: Boolean
    
    /**
      * Convenience getter for `state === 'rejected'`.
      */
    val rejected: Boolean
    
    /**
      * Convenience getter for `state === 'resolved'`.
      */
    val resolved: Boolean
    
    /**
      * The result of the last invocation.
      */
    val result: js.UndefOr[WithoutPromise[R]] = js.undefined
    
    /**
      * The status (resolved, rejected, pending)
      */
    val state: TaskStatus
  }
  object TaskState {
    
    inline def apply[A /* <: js.Array[Any] */, R](args: A, pending: Boolean, rejected: Boolean, resolved: Boolean, state: TaskStatus): TaskState[A, R] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskState[A, R]]
    }
    
    extension [Self <: TaskState[?, ?], A /* <: js.Array[Any] */, R](x: Self & (TaskState[A, R])) {
      
      inline def setArgs(value: A): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setRejected(value: Boolean): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setResult(value: WithoutPromise[R]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setState(value: TaskStatus): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobxTask.mobxTaskStrings.pending
    - typings.mobxTask.mobxTaskStrings.resolved
    - typings.mobxTask.mobxTaskStrings.rejected
  */
  trait TaskStatus extends StObject
  object TaskStatus {
    
    inline def pending: typings.mobxTask.mobxTaskStrings.pending = "pending".asInstanceOf[typings.mobxTask.mobxTaskStrings.pending]
    
    inline def rejected: typings.mobxTask.mobxTaskStrings.rejected = "rejected".asInstanceOf[typings.mobxTask.mobxTaskStrings.rejected]
    
    inline def resolved: typings.mobxTask.mobxTaskStrings.resolved = "resolved".asInstanceOf[typings.mobxTask.mobxTaskStrings.resolved]
  }
  
  @js.native
  trait Task_[A /* <: js.Array[Any] */, R]
    extends TaskFunc[A, WithoutPromise[R]]
       with TaskState[A, R]
       with TaskMethods[A, R] {
    
    /* InferMemberOverrides */
    override def apply(arg1: A): js.Promise[WithoutPromise[R]] = js.native
    
    /**
      * The last arguments passed to the task.
      */
    /* InferMemberOverrides */
    override val args: A & String = js.native
  }
  
  type WithoutPromise[T] = T
}
