package typings.mobxTask

import typings.mobxTask.mobxTaskStrings.args
import typings.mobxTask.mobxTaskStrings.error
import typings.mobxTask.mobxTaskStrings.result
import typings.mobxTask.mobxTaskStrings.state
import typings.mobxTask.mobxTaskStrings.swallow
import typings.std.Exclude
import typings.std.MethodDecorator
import typings.std.Pick
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskMod {
  
  /**
    * Creates a task in the `pending` state.
    */
  @JSImport("mobx-task/lib/task", "task")
  @js.native
  val task: TaskFactory = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - js.Function because Already inherited
  - typings.std.PropertyDecorator because var conflicts: length. Inlined  */ @js.native
  trait TaskCreator[K /* <: /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | args | swallow */] extends MethodDecorator {
    
    def apply(options: Pick[TaskOptions[_, _], K]): PropertyDecorator = js.native
    /**
      * Calls the actual task function.
      */
    def apply[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
    def apply[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R], options: Pick[TaskOptions[A, R], K]): Task_[A, R] = js.native
  }
  
  @js.native
  trait TaskFactory
    extends TaskCreator[
          /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | args | swallow
        ] {
    
    /**
      * Calls the actual task function.
      */
    /**
      * Creates a task in the `rejected` state.
      */
    def rejected[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
    /**
      * Creates a task in the `rejected` state.
      */
    @JSName("rejected")
    var rejected_Original: TaskCreator[
        Exclude[
          /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | args | swallow, 
          state
        ]
      ] = js.native
    /**
      * Creates a task in the `rejected` state.
      */
    @JSName("rejected")
    def rejected_state(
      options: Pick[
          TaskOptions[_, _], 
          Exclude[
            /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | args | swallow, 
            state
          ]
        ]
    ): PropertyDecorator = js.native
    @JSName("rejected")
    def rejected_state[A /* <: js.Array[_] */, R](
      func: js.Function1[/* args */ A, R],
      options: Pick[
          TaskOptions[A, R], 
          Exclude[
            /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | args | swallow, 
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
          TaskOptions[_, _], 
          Exclude[
            /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | args | swallow, 
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
    def resolved[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
    /**
      * Creates a task in the `resolved` state.
      */
    @JSName("resolved")
    var resolved_Original: TaskCreator[
        Exclude[
          /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | args | swallow, 
          state
        ]
      ] = js.native
    /**
      * Creates a task in the `resolved` state.
      */
    @JSName("resolved")
    def resolved_state(
      options: Pick[
          TaskOptions[_, _], 
          Exclude[
            /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | args | swallow, 
            state
          ]
        ]
    ): PropertyDecorator = js.native
    @JSName("resolved")
    def resolved_state[A /* <: js.Array[_] */, R](
      func: js.Function1[/* args */ A, R],
      options: Pick[
          TaskOptions[A, R], 
          Exclude[
            /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | args | swallow, 
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
          TaskOptions[_, _], 
          Exclude[
            /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | args | swallow, 
            state
          ]
        ]
    ): MethodDecorator = js.native
  }
  
  type TaskFunc[A /* <: js.Array[_] */, R] = js.Function1[/* args */ A, js.Promise[R]]
  
  @js.native
  trait TaskMatchProps[T1, T2, T3, A /* <: js.Array[_] */, R] extends StObject {
    
    var pending: js.UndefOr[js.Function1[/* args */ A, T1]] = js.native
    
    var rejected: js.UndefOr[js.Function1[/* error */ js.Any, T2]] = js.native
    
    var resolved: js.UndefOr[js.Function1[/* result */ WithoutPromise[R], T3]] = js.native
  }
  object TaskMatchProps {
    
    @scala.inline
    def apply[T1, T2, T3, A /* <: js.Array[_] */, R](): TaskMatchProps[T1, T2, T3, A, R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskMatchProps[T1, T2, T3, A, R]]
    }
    
    @scala.inline
    implicit class TaskMatchPropsMutableBuilder[Self <: TaskMatchProps[_, _, _, _, _], T1, T2, T3, A /* <: js.Array[_] */, R] (val x: Self with (TaskMatchProps[T1, T2, T3, A, R])) extends AnyVal {
      
      @scala.inline
      def setPending(value: /* args */ A => T1): Self = StObject.set(x, "pending", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      @scala.inline
      def setRejected(value: /* error */ js.Any => T2): Self = StObject.set(x, "rejected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRejectedUndefined: Self = StObject.set(x, "rejected", js.undefined)
      
      @scala.inline
      def setResolved(value: /* result */ WithoutPromise[R] => T3): Self = StObject.set(x, "resolved", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    }
  }
  
  @js.native
  trait TaskMethods[A /* <: js.Array[_] */, R] extends StObject {
    
    /**
      * Pattern-matches on the task status.
      * @param props
      */
    def `match`[PT, ET, RT](props: TaskMatchProps[PT, ET, RT, A, R]): PT | ET | RT = js.native
    
    /**
      * Resets the state.
      */
    def reset(): Unit = js.native
    
    /**
      * Sets the state.
      */
    def setState(props: TaskOptions[A, R]): Unit = js.native
    
    /**
      * Wraps the task by invoking `func` with the inner task function, which returns the wrapped function
      * and converts that to a task.
      *
      * @param func
      */
    def wrap[NA /* <: js.Array[_] */, NR](func: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[/* args */ NA, NR]]): Task_[NA, NR] = js.native
  }
  object TaskMethods {
    
    @scala.inline
    def apply[A /* <: js.Array[_] */, R](
      `match`: TaskMatchProps[js.Any, js.Any, js.Any, A, R] => js.Any | js.Any | js.Any,
      reset: () => Unit,
      setState: TaskOptions[A, R] => Unit,
      wrap: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[js.Any, js.Any]] => Task_[js.Any, js.Any]
    ): TaskMethods[A, R] = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), setState = js.Any.fromFunction1(setState), wrap = js.Any.fromFunction1(wrap))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[TaskMethods[A, R]]
    }
    
    @scala.inline
    implicit class TaskMethodsMutableBuilder[Self <: TaskMethods[_, _], A /* <: js.Array[_] */, R] (val x: Self with (TaskMethods[A, R])) extends AnyVal {
      
      @scala.inline
      def setMatch(value: TaskMatchProps[js.Any, js.Any, js.Any, A, R] => js.Any | js.Any | js.Any): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetState(value: TaskOptions[A, R] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrap(
        value: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[js.Any, js.Any]] => Task_[js.Any, js.Any]
      ): Self = StObject.set(x, "wrap", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TaskOptions[A /* <: js.Array[_] */, R] extends StObject {
    
    var args: js.UndefOr[A] = js.native
    
    var error: js.UndefOr[js.Any] = js.native
    
    var result: js.UndefOr[WithoutPromise[R]] = js.native
    
    var state: js.UndefOr[TaskStatus] = js.native
    
    var swallow: js.UndefOr[Boolean] = js.native
  }
  object TaskOptions {
    
    @scala.inline
    def apply[A /* <: js.Array[_] */, R](): TaskOptions[A, R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskOptions[A, R]]
    }
    
    @scala.inline
    implicit class TaskOptionsMutableBuilder[Self <: TaskOptions[_, _], A /* <: js.Array[_] */, R] (val x: Self with (TaskOptions[A, R])) extends AnyVal {
      
      @scala.inline
      def setArgs(value: A): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setResult(value: WithoutPromise[R]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setState(value: TaskStatus): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setSwallow(value: Boolean): Self = StObject.set(x, "swallow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwallowUndefined: Self = StObject.set(x, "swallow", js.undefined)
    }
  }
  
  @js.native
  trait TaskState[A /* <: js.Array[_] */, R] extends StObject {
    
    /**
      * The last arguments passed to the task.
      */
    val args: A = js.native
    
    /**
      * The error of the last failed invocation.
      */
    val error: js.UndefOr[js.Any] = js.native
    
    /**
      * Convenience getter for `state === 'pending'`.
      */
    val pending: Boolean = js.native
    
    /**
      * Convenience getter for `state === 'rejected'`.
      */
    val rejected: Boolean = js.native
    
    /**
      * Convenience getter for `state === 'resolved'`.
      */
    val resolved: Boolean = js.native
    
    /**
      * The result of the last invocation.
      */
    val result: js.UndefOr[WithoutPromise[R]] = js.native
    
    /**
      * The status (resolved, rejected, pending)
      */
    val state: TaskStatus = js.native
  }
  object TaskState {
    
    @scala.inline
    def apply[A /* <: js.Array[_] */, R](args: A, pending: Boolean, rejected: Boolean, resolved: Boolean, state: TaskStatus): TaskState[A, R] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskState[A, R]]
    }
    
    @scala.inline
    implicit class TaskStateMutableBuilder[Self <: TaskState[_, _], A /* <: js.Array[_] */, R] (val x: Self with (TaskState[A, R])) extends AnyVal {
      
      @scala.inline
      def setArgs(value: A): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejected(value: Boolean): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: WithoutPromise[R]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setState(value: TaskStatus): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobxTask.mobxTaskStrings.pending
    - typings.mobxTask.mobxTaskStrings.resolved
    - typings.mobxTask.mobxTaskStrings.rejected
  */
  trait TaskStatus extends StObject
  object TaskStatus {
    
    @scala.inline
    def pending: typings.mobxTask.mobxTaskStrings.pending = "pending".asInstanceOf[typings.mobxTask.mobxTaskStrings.pending]
    
    @scala.inline
    def rejected: typings.mobxTask.mobxTaskStrings.rejected = "rejected".asInstanceOf[typings.mobxTask.mobxTaskStrings.rejected]
    
    @scala.inline
    def resolved: typings.mobxTask.mobxTaskStrings.resolved = "resolved".asInstanceOf[typings.mobxTask.mobxTaskStrings.resolved]
  }
  
  type Task_[A /* <: js.Array[_] */, R] = (TaskFunc[A, WithoutPromise[R]]) with (TaskState[A, R]) with (TaskMethods[A, R])
  
  type WithoutPromise[T] = T
}
