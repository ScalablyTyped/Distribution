```
/**
Iterate over promises serially.

@param input - Iterated over serially in the `iterator` function.
@param iterator - Return value is ignored unless it's `Promise`, then it's awaited before continuing with the next iteration.
@returns Fulfills when all promises in `input` and ones returned from `iterator` are fulfilled, or rejects if any of the promises reject. The fulfillment value is the original `input`.
*/
```